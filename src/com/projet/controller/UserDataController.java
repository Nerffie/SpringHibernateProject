package com.projet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projet.entity.Utilisateur;
import com.projet.service.UserService;

@Controller
@RequestMapping("/UsersData")
public class UserDataController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel, HttpServletRequest req) {
		
		if (req.getSession().getAttribute("admin")!=null) {
			return new ModelAndView("usersData","utilisateur",userService.getUsers());
		}
		return new ModelAndView("redirect:/Login","",null);
		
	}
	
	
	
}
