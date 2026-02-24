package com.fitness_monolith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness_monolith.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
