package com.ishan.tokenbucket;

import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket {
    private final long capacity; // Maximum number of tokens in the bucket
    private final double refillRate; // Tokens added per millisecond
    private AtomicLong tokens; // Current number of tokens in the bucket
    private long lastRefillTimestamp; // Timestamp of the last token refill
    private static final int DEFAULT_CAPACITY = 10;

    public TokenBucket() {
        this.capacity = DEFAULT_CAPACITY;
        this.refillRate = 10 / 60 * 1000.0;
        this.tokens = new AtomicLong(capacity);
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    public TokenBucket(long capacity, double tokensPerSecond) {
        this.capacity = capacity;
        this.refillRate = tokensPerSecond / 1000.0;
        this.tokens = new AtomicLong(capacity);
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    public long getCapacity() {
        return capacity;
    }

    public double getRefillRate() {
        return refillRate;
    }

    public AtomicLong getTokens() {
        return tokens;
    }

    public long getLastRefillTimestamp() {
        return lastRefillTimestamp;
    }

    public boolean tryConsume(int tokens) {
        refillTokensAtRefreshRate();
        if (tokens <= this.tokens.get()) {
            this.tokens.getAndAdd(-tokens);
            return true;
        }
        return false;
    }

    private void refillTokensAtRefreshRate() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - lastRefillTimestamp;
        long tokensToAdd = (long) (elapsedTime * refillRate);

        if (tokensToAdd > 0) {
            tokens.set(Math.min(capacity, tokens.get() + tokensToAdd));
            lastRefillTimestamp = currentTime;
        }
    }

    public void refillTokens() {
        tokens.set(capacity);
        lastRefillTimestamp = System.currentTimeMillis();
    }
}