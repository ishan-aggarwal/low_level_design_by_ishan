package com.ishan;

public class RateLimiterManager {
    private static RateLimiterManager instance;
    private RateLimiter rateLimiter;

    private RateLimiterManager() {
        // Example initialization with a fixed window rate limiter
        this.rateLimiter = RateLimiterFactory.createRateLimiter("fixed", 100, 60000);
    }

    public static RateLimiterManager getInstance() {
        if (instance == null) {
            synchronized (RateLimiterManager.class) {
                if (instance == null) {
                    instance = new RateLimiterManager();
                }
            }
        }
        return instance;
    }

    public boolean allowRequest(String clientId) {
        return rateLimiter.allowRequest(clientId);
    }
}
