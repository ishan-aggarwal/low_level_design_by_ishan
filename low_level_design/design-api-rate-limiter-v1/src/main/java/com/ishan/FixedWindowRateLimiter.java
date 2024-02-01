package com.ishan;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class FixedWindowRateLimiter implements RateLimiter {
    private final Map<String, Integer> requestCounts = new HashMap<>();
    private final int maxRequests;

    public FixedWindowRateLimiter(int maxRequests, long windowInSeconds) {
        this.maxRequests = maxRequests;

        // Schedule a task to reset counts for each user after the fixed window duration
        Timer timer = new Timer(true);

        // The first argument to scheduleAtFixedRate is the TimerTask instance, which defines the code to be executed when the timer fires
        // The second argument is the delay before the first execution
        // The third argument is the period between successive executions
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                resetCounts();
            }
        }, 0, windowInSeconds * 1000);
    }

    private void resetCounts() {
        // Clear the entire map
        requestCounts.clear();
    }

    @Override
    public boolean isAllowed(String userId) {

        // Check if the user has exceeded the limit
        if (requestCounts.getOrDefault(userId, 0) >= maxRequests) {
            return false;
        }

        // Increment the request count and allow the request
        requestCounts.put(userId, requestCounts.getOrDefault(userId, 0) + 1);
        return true;
    }
}
