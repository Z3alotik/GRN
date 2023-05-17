package com.grove.grn_webapp.Controllers;

import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.RequestBodies.UserData;
import com.grove.grn_webapp.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpConnectTimeoutException;

@RestController
@RequestMapping(path = "api/v1/account")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<String> signUp(@RequestBody UserData userData) {
        return registrationService.signUp(userData);
    }
}
