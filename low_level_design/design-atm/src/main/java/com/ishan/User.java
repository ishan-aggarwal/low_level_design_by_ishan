package com.ishan;

import lombok.*;

@Builder
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Card card;
    BankAccount bankAccount;
}

