package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository repo;
	
	public User addUser(User user)
	{
		return this.repo.save(user);
	}

	public List<User> getAllUser()
	{
		return this.repo.findAll();
	}
	public int checkCredentials(String userName,String password)
	{
		int flag=0;
		if(!repo.login(userName, password).isEmpty())
		{
			flag=1;
			System.out.println("Inside  "+flag);
			return flag;
		}
		System.out.println("out --"+flag);
		return flag;
	}

}
