package com.app.mindbowser.web;

import java.io.IOException;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mindbowser.model.Manager;
import  com.app.mindbowser.services.AuthUserService;
import com.app.mindbowser.web.dto.AuthUserRegistrationDto;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/registration")
public class AuthUserRegistrationController {

    @Autowired
    private AuthUserService userService;
    
    @ModelAttribute("user")
    public AuthUserRegistrationDto userRegistrationDto() {
        return new AuthUserRegistrationDto();
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid AuthUserRegistrationDto userDto,
    	 BindingResult result, Model model) {

    	String email = userDto.getEmail();
    	if (email != null && !email.equals("")) {
	        Optional<Manager> existing = userService.findByEmail(email);
	        if (existing.isPresent()) {
	            result.rejectValue("email", null, "There is already an account registered with that email");
	        }
        }    
        try {
			userService.save(userDto);
		} catch (IOException e) {
           e.printStackTrace();
		}
        return "";
    }   
    
}