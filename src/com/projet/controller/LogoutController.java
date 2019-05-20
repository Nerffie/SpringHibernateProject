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
@RequestMapping("/Logout")
public class LogoutController {
	
	
	@GetMapping("")
	public String loginPage(Model theModel,HttpServletRequest req) {
		
		
		req.getSession().invalidate();
		
		return "redirect:/Login";
		
	}
	
	
}
