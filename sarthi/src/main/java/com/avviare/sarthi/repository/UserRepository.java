package com.avviare.sarthi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avviare.sarthi.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

