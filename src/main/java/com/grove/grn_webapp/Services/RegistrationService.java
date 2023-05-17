package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.RequestBodies.UserData;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {

    ResponseEntity<String> signUp(UserData userData);
}
