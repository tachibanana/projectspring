package com.app.project.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.project.spring.dao.UserDao;
import com.app.project.spring.models.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public User getUserById(int userId) {
		User user = null;
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(User.class, userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	public boolean addUser(User user) {
		try{
			Session session  = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
