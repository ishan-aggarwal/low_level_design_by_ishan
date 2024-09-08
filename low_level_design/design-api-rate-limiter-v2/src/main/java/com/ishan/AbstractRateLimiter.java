package com.ishan;

public abstract class AbstractRateLimiter implements RateLimiter {
    protected int maxRequests;
    protected long windowSizeInMillis;

    public AbstractRateLimiter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
    }

    @Override
    public boolean allowRequest(String clientId) {
        return isRequestAllowed(clientId);
    }

    protected abstract boolean isRequestAllowed(String clientId);
}
