package com.avviare.sarthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avviare.sarthi.dto.User;
import com.avviare.sarthi.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

	@Autowired
	private UserService userService;

//    @PostMapping("/signup")
//    public String signupUser(@RequestBody User userDto) {
//        if (userDto.getName() == null || userDto.getEmail() == null || userDto.getPassword() == null) {
//            return "Please fill all fields";
//        }
//        return userService.registerUser(userDto);
//    }

	@PostMapping("/signup")
	public String signup(@RequestBody User user) {
		userService.registerUser(user);
		return "User registered successfully";
	}

	@PostMapping("/login")
	public String login(@RequestBody User loginUser) {
		return userService.loginUser(loginUser.getEmail(), loginUser.getPassword());
	}
}
