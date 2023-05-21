package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.UserDTO;
import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public ResponseEntity<String> signUp(UserDTO userDTO) {

        if (userDTO.getEmail() == null || userDTO.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().body("Email is required!");
        }

        User existingUser = userRepository.findByEmail(userDTO.getEmail());
        if (existingUser != null) {
            return ResponseEntity.badRequest().body("A user with this email already exists!");
        }

        User newUser = new User();
        newUser.setName(userDTO.getName());
        newUser.setSurname(userDTO.getSurname());
        newUser.setEmail(userDTO.getEmail());
        newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));


        User savedUser = userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully.");
    }
}
