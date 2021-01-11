package com.app.mindbowser.service.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.mindbowser.model.Manager;
import com.app.mindbowser.repository.AuthUserRepository;




@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AuthUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Manager manager = userRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("Invalid username or password."));
		return new org.springframework.security.core.userdetails.User(manager.getEmail(), manager.getPassword(),
				getAuthorities(manager));
	}

	@SuppressWarnings("unchecked")
	private static Collection<? extends GrantedAuthority> getAuthorities(Manager manager) {
		//String[] userRoles = manager.getRole().stream().map((role) -> role.getName()).toArray(String[]::new);
		//Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
		return (Collection<? extends GrantedAuthority>) manager;
	}
}