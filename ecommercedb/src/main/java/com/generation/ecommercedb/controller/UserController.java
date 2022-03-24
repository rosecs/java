package com.generation.ecommercedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommercedb.model.User;
import com.generation.ecommercedb.service.UserService;

@RestController
@RequestMapping(path="api/user/")
@CrossOrigin("*")
public class UserController {
	public final UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	} //constructor
	@GetMapping
	public List<User> getUsarios(){
		return userService.getUsers();
	} // getUsuarios
		
	@GetMapping(path="{userId}")
	public User getUsuario(@PathVariable("userId")Long userId) {
		return userService.getUser(userId);
	}// getUsuario
		
	@DeleteMapping(path= {"userId"})
	public void borrarUsuario(@PathVariable ("userId") Long userId) {
		userService.deleteUser(userId);
	}// borrarUsuario
	 @PostMapping(path="{userId}")
	public void actualizarUsuario (@PathVariable ("userId") Long userId,
			@RequestParam String currentPassword,
			@RequestParam String newPassword) {
			userService.updateUser(userId, currentPassword, newPassword);
	}//actualizarUsuario
	 
} //class userController
