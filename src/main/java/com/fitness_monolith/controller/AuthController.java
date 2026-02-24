package com.fitness_monolith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fitness_monolith.FitnessMonolithApplication;
import com.fitness_monolith.model.User;
import com.fitness_monolith.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
	
	public AuthController(UserService userService) {
		super();
		this.userService = userService;
		
		
	}


	@GetMapping("/test")
	public String test()
	{
		return "Hello";
	}



	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
	
		System.out.println("Register");
		return userService.register(user);
	}
	
}
