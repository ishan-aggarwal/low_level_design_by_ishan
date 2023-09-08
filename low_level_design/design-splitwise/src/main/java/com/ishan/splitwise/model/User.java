package com.ishan.splitwise.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {
    private String name;
    private String userId;
    private String emailId;
    private String phoneNumber;

    public User(@NonNull String emailId, String name, String phoneNumber) {
        userId = UUID.randomUUID().toString();
        this.emailId = emailId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}