package com.ishan;

public interface RateLimiter {
    boolean allowRequest(String clientId);
}
