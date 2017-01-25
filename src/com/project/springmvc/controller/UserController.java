package com.project.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.springmvc.service.impl.UserServiceImpl;


@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/user")
	public ModelAndView get(@RequestParam(value="userId") int userId){
		
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("username", userService.getUserById(userId).getUsername());
		return modelAndView;
	}

}
