package com.project.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.springmvc.model.User;
import com.project.springmvc.service.impl.UserServiceImpl;


@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("get")
	public ModelAndView get(@RequestParam(value="userId") int userId){

		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("user",userService.getUserById(userId));
		return modelAndView;
	}
	
	@RequestMapping(value="view", method=RequestMethod.POST)
	public ModelAndView view(@Valid @ModelAttribute("user") User user, BindingResult result){
		if(result.hasErrors())
			return new ModelAndView("form");
		
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping("form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("form");
		return modelAndView;
	}

}
