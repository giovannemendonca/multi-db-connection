package dev.giovannemendonca.core.controller;

import dev.giovannemendonca.core.model.core.Users;
import dev.giovannemendonca.core.repository.core.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Users> listAll() {
        return userRepository.findAll();
    }


}
