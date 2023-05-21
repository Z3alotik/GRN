package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.LoginDTO;
import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public ResponseEntity<?> login(LoginDTO loginDTO) {
        User user = userRepository.findByEmail(loginDTO.getEmail());

        String password = loginDTO.getPassword();
        String encodedPassword = user.getPassword();
        boolean isPswRight = passwordEncoder.matches(password, encodedPassword);
        if (isPswRight) {
            Optional<User> checkUser = Optional.ofNullable(userRepository.findByEmail(loginDTO.getEmail()));
            if (checkUser.isPresent()) {
                return ResponseEntity.ok("{\"message\": \"Login success!\"}");
            } else {
                return ResponseEntity.badRequest().body("{\"message\": \"Email not exists!\"}");
            }
        } else {
            return ResponseEntity.badRequest().body("Password mismatch");
        }
    }
}
