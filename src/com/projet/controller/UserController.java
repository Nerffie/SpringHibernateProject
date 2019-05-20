package com.projet.controller;



import javax.servlet.http.HttpServletRequest;

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
@RequestMapping("/Login")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel,HttpServletRequest req) {
		
		
		if (req.getSession().getAttribute("user")!=null) {
			return new ModelAndView("index","",null);
		}
		theModel.addAttribute("utilisateur", new Utilisateur());
		return new ModelAndView("login","utilisateur",new Utilisateur());
		
	}
	
	@PostMapping("")
	public String login(@ModelAttribute("utilisateur") Utilisateur u,HttpServletRequest request) {
		Utilisateur user = userService.getUserFromEmail(u.getEmail());
		System.out.println(user);
		if (user == null) {
			return "login";
		}
		if (userService.passwordMatch(u.getMotDePasse(), user)) {
			userService.updateConnexion(user);
			request.getSession().setAttribute("user", user);
			return "redirect:/Home";
		}
		else {
			
			return "login";
		}
		//userService.saveUser(u);
		
	}
	
}
