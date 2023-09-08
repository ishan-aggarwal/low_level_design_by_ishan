package com.ishan.splitwise.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UserShare {
    public UserShare(String userId, double share) {
        this.userId = userId;
        this.share = share;
        contributions = new ArrayList<>();
    }

    private String userId;
    private double share;
    // we have allowed multiple contributions from the same user
    List<Contribution> contributions;
}