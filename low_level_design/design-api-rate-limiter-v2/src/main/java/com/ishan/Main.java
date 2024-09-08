package com.ishan;

public class Main {
    public static void main(String[] args) {
        RateLimiter fixedWindowRateLimiter = RateLimiterFactory.createRateLimiter("fixed", 10, 60000);
        RateLimiter slidingWindowRateLimiter = RateLimiterFactory.createRateLimiter("sliding", 10, 60000);

        // Testing Fixed Window Rate Limiter
        System.out.println("Fixed Window Rate Limiter:");
        for (int i = 0; i < 12; i++) {
            System.out.println(fixedWindowRateLimiter.allowRequest("client1"));
        }

        // Testing Sliding Window Rate Limiter
        System.out.println("Sliding Window Rate Limiter:");
        for (int i = 0; i < 12; i++) {
            System.out.println(slidingWindowRateLimiter.allowRequest("client2"));
        }
    }
}
