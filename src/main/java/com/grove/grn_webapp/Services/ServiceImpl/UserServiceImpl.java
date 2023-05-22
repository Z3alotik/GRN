package com.grove.grn_webapp.Services.ServiceImpl;

import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
