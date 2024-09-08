package com.ishan;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class SlidingWindowRateLimiterWithTemplate extends AbstractRateLimiter {
    private Map<String, Queue<Long>> requestTimestamps;

    public SlidingWindowRateLimiterWithTemplate(int maxRequests, long windowSizeInMillis) {
        super(maxRequests, windowSizeInMillis);
        this.requestTimestamps = new HashMap<>();
    }

    @Override
    protected boolean isRequestAllowed(String clientId) {
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
