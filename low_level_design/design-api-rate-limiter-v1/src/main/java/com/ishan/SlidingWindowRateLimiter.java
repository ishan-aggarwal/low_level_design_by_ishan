package com.ishan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindowRateLimiter implements RateLimiter {
    private final Map<String, List<Long>> requestTimestamps = new HashMap<>();
    private final int maxRequests;
    private final long windowInSeconds;

    public SlidingWindowRateLimiter(int maxRequests, long windowInSeconds) {
        this.maxRequests = maxRequests;
        this.windowInSeconds = windowInSeconds;
    }

    @Override
    public boolean isAllowed(String userId) {
        long currentTime = System.currentTimeMillis() / 1000;
        requestTimestamps.putIfAbsent(userId, new ArrayList<>());

        List<Long> timestamps = requestTimestamps.get(userId);

        // Remove timestamps that are outside the time window
        timestamps.removeIf(timestamp -> currentTime - timestamp >= windowInSeconds);

        // Check if the user has exceeded the limit
        if (timestamps.size() >= maxRequests) {
            return false;
        }

        // Add the current timestamp and allow the request
        timestamps.add(currentTime);
        return true;
    }
}
