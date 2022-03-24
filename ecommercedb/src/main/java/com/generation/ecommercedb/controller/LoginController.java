package com.generation.ecommercedb.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommercedb.jwt.config.JwtFilter;
import com.generation.ecommercedb.model.Token;
import com.generation.ecommercedb.model.User;
import com.generation.ecommercedb.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/api/login/")
@CrossOrigin(origins="*") // * means your service is called from whatever route
public class LoginController {
	private final UserService userService;
	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}//constructor
	@PostMapping
	public Token Login(@RequestBody User user) throws ServletException {
		if (userService.login(user.getUserName(), user.getPassword())) {
			return new Token(generateToken(user.getUserName()));
		}// if 
		throw new ServletException("Nombre de usuario o contraseña incorrectos");
	} // Login
	
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 10);
		return Jwts.builder().setSubject(username).claim("role", "user")
				.setIssuedAt(new Date()).setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
	}// generateToken	
}
