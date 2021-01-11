package com.app.mindbowser.services;


import java.io.IOException;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.mindbowser.model.Manager;
import com.app.mindbowser.repository.AuthUserRepository;
import com.app.mindbowser.web.dto.AuthUserRegistrationDto;



@Service
@Transactional(rollbackFor = { Throwable.class })
public class AuthUserServiceImpl implements AuthUserService {

    @Autowired
    private AuthUserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

	@PersistenceContext
	private EntityManager entityManager;

    
    public Optional<Manager> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Manager save(AuthUserRegistrationDto registration) throws IOException {
        Manager user =new Manager();
        user.setManagerid(registration.getManagerid());
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
        user.setAddress(registration.getAddress());
        user.setDob(registration.getDob());
        user.setMobile(registration.getMobile());
        user.setCity(registration.getCity());
        return userRepository.save(user);
    }
}