package com.project.springmvc.dao;

import java.util.List;

import com.project.springmvc.model.User;

public interface UserDao {

	public User getUserById(int userId);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getAllUser();

}
