package com.grove.grn_webapp;

import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrnWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrnWebAppApplication.class, args);

    }

    private void insertUser(UserRepository userRepository) {
        userRepository.save(new User("Natálie", "Vicherková", "naty.vicherkova@seznam.cz", "111"));
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) {
        return (args) -> {
            insertUser(userRepository);
            System.out.println(userRepository.findAll());
        };
    }
}
