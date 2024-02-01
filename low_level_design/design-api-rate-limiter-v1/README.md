# Rate Limiter Service - Low-Level Design

## Problem Statement

Implement a rate limiter service in Java that enforces a limit on the number of requests a user can make within a
specified time window. The goal is to prevent abuse or excessive usage from a single user.

## Requirements

1. **Interface Definition:**
    - Create a `RateLimiter` interface with a method `isAllowed(String userId)` that returns `true` if the user is
      allowed to make a request and `false` otherwise.

2. **Rate Limiting Logic:**
    - Implement a concrete class `InMemoryRateLimiter` that implements the `RateLimiter` interface.
    - The rate limiter should allow a configurable maximum number of requests (`maxRequests`) within a specified time
      window (`windowInSeconds`).
    - Use a data structure to keep track of the number of requests made by each user and the timestamps of those
      requests.

3. **User Identification:**
    - The rate limiter should identify users based on a unique user ID provided as a parameter to the `isAllowed`
      method.

4. **Time Window Handling:**
    - Ensure that the rate limiter correctly resets the request count for each user when the time window has passed
      since their last request.
    - Maintain a list of timestamps for each user and remove timestamps that are outside the specified time window.

## Implementation Example

```java
public class Main {
    public static void main(String[] args) {
        // Example: Allow 5 requests per minute
        RateLimiter rateLimiter = new InMemoryRateLimiter(5, 60);

        String userId = "user123";

        for (int i = 0; i < 7; i++) {
            if (rateLimiter.isAllowed(userId)) {
                System.out.println("Request accepted");
            } else {
                System.out.println("Request denied");
            }
        }
    }
}
