package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Enums.RoleName;
import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.RequestBodies.UserRegisterData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<String> signUp(UserRegisterData userRegisterData) {

        if (userRegisterData.getEmail() == null || userRegisterData.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().body("Email is required!");
        }

        User existingUser = userRepository.findByEmail(userRegisterData.getEmail());
        if (existingUser != null) {
            return ResponseEntity.badRequest().body("A user with this email already exists!");
        }

        User newUser = new User();
        newUser.setName(userRegisterData.getName());
        newUser.setSurname(userRegisterData.getSurname());
        newUser.setEmail(userRegisterData.getEmail());
        newUser.setPassword(userRegisterData.getPassword());

        User savedUser = userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully.");
    }
}
