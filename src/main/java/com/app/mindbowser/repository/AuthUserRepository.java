package com.app.mindbowser.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.mindbowser.model.Manager;



@Repository
public interface AuthUserRepository extends JpaRepository <Manager, Integer> {
    Optional<Manager> findByEmail(String email);
}