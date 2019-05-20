package com.projet.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projet.entity.Utilisateur;
import com.projet.service.UserService;

@Controller
@RequestMapping("/SignUp")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public ModelAndView registerPage(Model theModel) {
		theModel.addAttribute("utilisateur", new Utilisateur());
		return new ModelAndView("signup","utilisateur",new Utilisateur());
		
	}
	
	@PostMapping("")
	public String register(@ModelAttribute("utilisateur") Utilisateur u) {
		Utilisateur user = userService.getUserFromEmail(u.getEmail());
		if (user!=null) {
			return "signup";
		}
		userService.saveUser(u);
		return "redirect:/Login";
		
	}
	
}
