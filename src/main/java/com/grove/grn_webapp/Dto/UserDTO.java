package com.grove.grn_webapp.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
        private String name;
        private String surname;
        private String email;
        private String password;
}
