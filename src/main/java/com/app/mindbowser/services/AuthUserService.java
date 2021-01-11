package com.app.mindbowser.services;

import java.io.IOException;
import java.util.Optional;

import com.app.mindbowser.model.Manager;
import com.app.mindbowser.web.dto.AuthUserRegistrationDto;

public interface AuthUserService {

	
    Optional<Manager> findByEmail(String email);

    Manager save(AuthUserRegistrationDto registration) throws IOException;
}