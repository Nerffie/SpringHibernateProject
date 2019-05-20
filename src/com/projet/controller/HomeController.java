package com.projet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Home")
public class HomeController {

	
	@GetMapping("")
	public String loginPage(HttpServletRequest req) {
		if (req.getSession().getAttribute("user")!=null) {
			return "index";
		}
		return "redirect:/Login";
	}
	
	@PostMapping("")
	public String login() {
		return null;
	}
	
}
