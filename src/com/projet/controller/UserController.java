package com.projet.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.entity.Utilisateur;
import com.projet.service.UserService;

@Controller
@RequestMapping("/Login")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public String loginPage(Model theModel) {
		return "login";
	}
	
	@PostMapping("")
	public String login(@ModelAttribute("user") Utilisateur u) {
		userService.findByEmail(u.getEmail());
		userService.saveUser(u);
		return "redirect:/user/list";
	}
	
}
