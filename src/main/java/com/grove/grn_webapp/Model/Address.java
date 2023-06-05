package com.grove.grn_webapp.Model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Embeddable
@NoArgsConstructor
public class Address {
    private String houseNumber;
    private String zip;
    private String street;
    private String city;

    public Address(String zip, String houseNumber, String street, String city) {
        this.zip = zip;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }
}
