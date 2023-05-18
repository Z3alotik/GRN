package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.LoginDTO;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    ResponseEntity<?> login(LoginDTO loginDTO);
}
