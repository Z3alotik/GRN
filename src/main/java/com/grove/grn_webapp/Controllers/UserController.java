package com.grove.grn_webapp.Controllers;

import com.grove.grn_webapp.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @GetMapping("/user")
    public void showUser() {
        User user = new User(
                "Martin",
                "Bartošek",
                "11Bart11@email.cz",
                "mb"
        );
        user.toString();
    }
}