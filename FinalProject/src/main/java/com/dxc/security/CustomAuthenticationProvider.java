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



@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

/*	@Autowired
	private CustomUserService userService;*/
	
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 
		 String username = authentication.getName();
         String password = (String) authentication.getCredentials();
		
	      List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	         
	    
	      
          if (username == null || !username.equalsIgnoreCase("admin")) {
              throw new BadCredentialsException("Username not found.");
          }
   
          if (!password.equals("123")) {
              throw new BadCredentialsException("Wrong password.");
          }
    
	      
          authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

	 
	        return new UsernamePasswordAuthenticationToken(username, password, authorities);
	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

}
