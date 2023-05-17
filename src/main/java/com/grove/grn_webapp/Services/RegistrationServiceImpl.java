package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.RequestBodies.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    UserRepository userRepository;
    @Override
    public ResponseEntity<String> signUp(UserData userData) {
        if (userData.getEmail() == null || userData.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().body("Email is required!");
        }
        User newUser = new User();
        newUser.setName(userData.getName());
        newUser.setSurname(userData.getSurname());
        newUser.setEmail(userData.getEmail());
        newUser.setPassword(userData.getPassword());

        User savedUser = userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully.");
    }
}
