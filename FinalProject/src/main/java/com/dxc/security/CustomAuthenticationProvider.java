package com.dxc.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.dxc.model.User;
import com.dxc.service.UserService;



@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Autowired
	private UserService userService;
	
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 
		 String username = authentication.getName();
         String password = (String) authentication.getCredentials();
	         
	      User userChecking = (User) userService.getOneCus(username);
	      
          if (username == null || !username.equalsIgnoreCase(userChecking.getNameCustomer())) {
              throw new BadCredentialsException("Username not found.");
          }
   
          if (!password.equals(userChecking.getPassCustomer())) {
              throw new BadCredentialsException("Wrong password.");
          }
    
          
          List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
          authorities.add(new SimpleGrantedAuthority(userChecking.isRole()?"ROLE_ADMIN":"ROLE_USER"));
          
	 
	        return new UsernamePasswordAuthenticationToken(username, password, authorities);
	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

}
