package com.grove.grn_webapp.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressDTO {
    private String houseNumber;
    private String zip;
    private String street;
    private String city;
}
