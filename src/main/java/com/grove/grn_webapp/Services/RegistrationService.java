package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {

    ResponseEntity<String> signUp(UserDTO userDTO);
}
