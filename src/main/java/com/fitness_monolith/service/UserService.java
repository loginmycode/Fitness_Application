package com.fitness_monolith.service;

import org.springframework.stereotype.Service;


import com.fitness_monolith.model.User;
import com.fitness_monolith.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository userRepository;
	
		public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}






	public User register(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
