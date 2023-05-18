package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.RequestBodies.UserLoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<?> login(UserLoginData userLoginData) {
        User user = userRepository.findByEmail(userLoginData.getEmail());

        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email.");
        }

        if (!user.getPassword().equals(userLoginData.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid password.");
        }

        return ResponseEntity.ok("Login successful.");
    }
}
