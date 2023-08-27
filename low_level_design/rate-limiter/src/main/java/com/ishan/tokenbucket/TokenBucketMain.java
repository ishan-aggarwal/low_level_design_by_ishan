package com.ishan.tokenbucket;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TokenBucketMain {
    public static void main(String[] args) throws InterruptedException {

        UserTokenBucketManager tokenBucketManager = UserTokenBucketManager.getInstance(); // max capacity is 10 tokens for the bucket with every 60 seconds

        // Run token bucket refresh task every minute
        // This is to ensure that the token bucket is always full
        Runnable tokenBucketRefreshTask = getTokenBucketRefreshTask(tokenBucketManager);
        Thread tokenBucketRefreshThread = new Thread(tokenBucketRefreshTask);
        tokenBucketRefreshThread.setDaemon(true);
        tokenBucketRefreshThread.start();

        // If the token bucket is empty, then the user will not be able to make requests
        // This is because the token bucket will not have enough tokens to satisfy the request
        String userId = "user123"; // Replace with actual user ID

        for (int i = 1; i <= 30; i++) {
            if (tokenBucketManager.tryConsume(userId, 1)) {
                System.out.println("Request " + i + " from user " + userId + " processed.");
            } else {
                System.out.println("Request " + i + " from user " + userId + " rejected.");
            }
            TimeUnit.SECONDS.sleep(5); // Simulate time between requests (every request is made after 5 seconds)
        }
    }

    private static Runnable getTokenBucketRefreshTask(UserTokenBucketManager tokenBucketManager) {
        return () -> {
            while (true) {
                try {
                    // Run token bucket refresh task every minute
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Refreshing token buckets..." + new Date());
                tokenBucketManager.getUserTokenBuckets().values().forEach(TokenBucket::refillTokens);
            }
        };
    }
}
