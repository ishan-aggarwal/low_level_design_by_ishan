package com.ishan;

public interface RateLimiter {

    /*
    This interface will have a method isAllowed which takes a user ID as a parameter
    and returns true if the user is allowed to make a request, and false otherwise.
     */
    boolean isAllowed(String userId);
}
