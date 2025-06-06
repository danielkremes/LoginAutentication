package com.drk.spring_security.spring_security;

import com.drk.spring_security.spring_security.model.Users;
import com.drk.spring_security.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
;
import java.util.List;

@Component
public class StarterApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Users> user = List.of(
                new Users("admin", "adminpass1", "admin1@example.com"),
                new Users("admin", "adminpass2", "admin2@example.com"),
                new Users("admin", "adminpass3", "admin3@example.com"),
                new Users("admin", "adminpass4", "admin4@example.com"),
                new Users("admin", "adminpass5", "admin5@example.com"),
                new Users("admin", "adminpass6", "admin6@example.com"),
                new Users("admin", "adminpass7", "admin7@example.com"),
                new Users("admin", "adminpass8", "admin8@example.com"),
                new Users("admin", "adminpass9", "admin9@example.com"),
                new Users("admin", "adminpass10", "admin10@example.com"),

                new Users("user", "userpass1", "user1@example.com"),
                new Users("user", "userpass2", "user2@example.com"),
                new Users("user", "userpass3", "user3@example.com"),
                new Users("user", "userpass4", "user4@example.com"),
                new Users("user", "userpass5", "user5@example.com"),
                new Users("user", "userpass6", "user6@example.com"),
                new Users("user", "userpass7", "user7@example.com"),
                new Users("user", "userpass8", "user8@example.com"),
                new Users("user", "userpass9", "user9@example.com"),
                new Users("user", "userpass10", "user10@example.com")
        );

        userRepository.saveAll(user);
    }
}
