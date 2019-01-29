package br.com.lucas.cursomc.service;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.lucas.cursomc.security.UserSS;

public class UserService {

	public static UserSS Authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
