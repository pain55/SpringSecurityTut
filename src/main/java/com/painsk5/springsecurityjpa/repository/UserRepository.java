package com.painsk5.springsecurityjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.painsk5.springsecurityjpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUsername(String username);
}
