package com.grove.grn_webapp.Controllers;

import com.grove.grn_webapp.Dto.LoginDTO;
import com.grove.grn_webapp.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/account")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        return loginService.login(loginDTO);
    }
}
