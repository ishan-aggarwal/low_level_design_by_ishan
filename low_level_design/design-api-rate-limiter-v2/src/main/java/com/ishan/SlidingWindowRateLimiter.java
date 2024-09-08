package com.ishan;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class SlidingWindowRateLimiter implements RateLimiter {
    private final int maxRequests;
    private final long windowSizeInMillis;
    private Map<String, Queue<Long>> requestTimestamps;

    public SlidingWindowRateLimiter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
        this.requestTimestamps = new HashMap<>();
    }

    @Override
    public boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();
        requestTimestamps.putIfAbsent(clientId, new LinkedList<>());

        Queue<Long> timestamps = requestTimestamps.get(clientId);
        while (!timestamps.isEmpty() && currentTime - timestamps.peek() > windowSizeInMillis) {
            timestamps.poll();
        }

        if (timestamps.size() < maxRequests) {
            timestamps.add(currentTime);
            return true;
        }
        return false;
    }
}
