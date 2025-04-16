package com.avviare.sarthi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avviare.sarthi.dto.User;
import com.avviare.sarthi.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

//    public String registerUser(User userDto) {
//        if (userRepository.existsByEmail(userDto.getEmail())) {
//            return "Email already exists";
//        }
//
//        User user = new User(userDto.getName(), userDto.getEmail(), userDto.getPassword());
//        userRepository.save(user);
//        return "User registered successfully";
//    }
    
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public String loginUser(String email, String password) {
        User existingUser = userRepository.findByEmail(email);
        if (existingUser != null && existingUser.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Invalid credentials";
    }
}
