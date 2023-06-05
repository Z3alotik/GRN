package com.grove.grn_webapp.Services.ServiceImpl;

import com.grove.grn_webapp.Dto.UserDTO;
import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.Services.RegistrationService;
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

        User newUser = User.builder()
                .name(userDTO.getName())
                .surname(userDTO.getSurname())
                .email(userDTO.getEmail())
                .password(passwordEncoder.encode(userDTO.getPassword()))
                .build();

        userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully.");
    }
}
