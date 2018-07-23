package com.dxc.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.dxc.model.User;

public class CustomAuthToken extends UsernamePasswordAuthenticationToken{

	
	 private User userCus;

	    public CustomAuthToken(String principal, String credentials,  Collection<? extends GrantedAuthority> authorities, User userCus) {
	            super(principal, credentials, authorities);

	            this.userCus = userCus;
	    }

		public User getUserCus() {
			return userCus;
		}

		public void setUserCus(User userCus) {
			this.userCus = userCus;
		}
	    
	    
	    
}
