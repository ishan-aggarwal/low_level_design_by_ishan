package com.ishan.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Contribution {
    private String contributionId;
    private double contributionValue; // how much amount did the user contribute
    private String transactionId; // transaction id of the contribution
    private LocalDateTime contributionDate; // date of the contribution
    private String transactionDescription; // description of the transaction
}