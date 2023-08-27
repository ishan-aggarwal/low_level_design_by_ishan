package com.ishan.tokenbucket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserTokenBucketManager {
    private final Map<String, TokenBucket> userTokenBuckets;

    private static UserTokenBucketManager INSTANCE = null;

    private UserTokenBucketManager() {
        this.userTokenBuckets = new HashMap<>();
        // Initialize token buckets for each user
        // You can load user data from a database or other source
    }

    private UserTokenBucketManager(long capacity, double tokensPerSecond) {
        this.userTokenBuckets = new HashMap<>();
        // Initialize token buckets for each user
        // You can load user data from a database or other source
    }

    public static UserTokenBucketManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserTokenBucketManager();
        }
        return INSTANCE;
    }

    public Map<String, TokenBucket> getUserTokenBuckets() {
        return userTokenBuckets;
    }

    public boolean tryConsume(String userId, int tokens) {
//        if (!userTokenBuckets.containsKey(userId)) {
//            return false; // User not found
//        }
//        return userTokenBuckets.get(userId).tryConsume(tokens);

        userTokenBuckets.putIfAbsent(userId, new TokenBucket()); // Initialize if not present
//        return userTokenBuckets.get(userId).tryConsume(tokens);

        TokenBucket userTokenBucket = userTokenBuckets.get(userId);
        boolean result = userTokenBucket.tryConsume(tokens);
        if (result) {
            System.out.println("User " + userId + " consumed " + tokens + " tokens. New token balance = " + userTokenBucket.getTokens() + " tokens at time " + new Date());
        } else {
            System.out.println("User " + userId + " rejected. Insufficient tokens. Token balance = " + userTokenBucket.getTokens() + " tokens at time " + new Date());
        }
        return result;
    }
}