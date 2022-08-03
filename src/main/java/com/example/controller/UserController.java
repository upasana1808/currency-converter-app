package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	public UserService service;
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	@PostMapping("/create") 	
	public User create(@RequestBody User user)
	{
		return this.service.addUser(user);
	}
	
	@GetMapping("/read") 
	public List<User> read()
	{
		return this.service.getAllUser();
	}
	@PutMapping("/update/{id}") 
	public void update()
	{
		
	}
	@DeleteMapping("/delete/{id}") 
	public void delete()
	{
		
	}@GetMapping("/readOne") 
	public void readOne()
	{
		
	}
	@GetMapping("/login/{userName}/{password}") 
	public int login(@PathVariable String userName,@PathVariable String password)
	{
		return this.service.checkCredentials(userName, password);
	}
	

}
