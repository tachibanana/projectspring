package com.app.project.spring.services;

import java.util.List;

import com.app.project.spring.models.User;

public interface UserService {

	public User getUserById(int userId);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getAllUser();
}
