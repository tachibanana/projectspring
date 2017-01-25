package com.app.project.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.project.spring.models.User;
import com.app.project.spring.services.impl.UserServiceImpl;

public class Main {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_dao.xml"); 
		UserServiceImpl service = context.getBean("userServiceImpl", UserServiceImpl.class);

	}

}
