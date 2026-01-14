package com.hamza.portfolio.repository;

import com.hamza.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    // Finds a user by email (needed for Login)
    Optional<User> findByEmail(String email);
    
    // Checks if an email exists (needed for Registration)
    boolean existsByEmail(String email);
}