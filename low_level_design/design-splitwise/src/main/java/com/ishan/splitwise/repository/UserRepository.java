package com.ishan.splitwise.repository;

import com.ishan.splitwise.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class UserRepository {
    // so this is just an in-memory database
    // we can use a real database too
    // here we are maintaining a map of userEmailId to user
    public static Map<String, User> userHashMap = new HashMap<>();
}