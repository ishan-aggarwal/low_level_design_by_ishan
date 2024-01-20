package com.ishan.model;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Location {
    String address;
    int pinCode;
    String city;
    String state;
    String country;

    public Location(int pinCode, String city, String state, String country) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

