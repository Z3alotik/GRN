package com.grove.grn_webapp.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserDTO {
        private String name;
        private String surname;
        private String email;
        private String password;
}
