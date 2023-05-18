package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.RequestBodies.UserLoginData;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    ResponseEntity<?> login(UserLoginData userLoginData);
}
