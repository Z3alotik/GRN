package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.RequestBodies.UserRegisterData;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {

    ResponseEntity<String> signUp(UserRegisterData userRegisterData);
}
