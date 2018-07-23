package com.dxc.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	   
          if (username == null && userChecking!=null || !username.equalsIgnoreCase("admin")) {
              throw new BadCredentialsException("Username not found.");
          }
   
          if (!password.equals(userChecking.getPassCustomer())) {
              throw new BadCredentialsException("Wrong password.");
          }
    
          
          List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
          authorities.add(new SimpleGrantedAuthority(userChecking.isRole()?"ROLE_ADMIN":"ROLE_USER"));
          
	 
	        return new CustomAuthToken(username, password, authorities,userChecking);
	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

}
