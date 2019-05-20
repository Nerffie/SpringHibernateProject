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

@Controller
@RequestMapping("/Ask")
public class AskController {

	
	
	
	@GetMapping("")
	public String loginPage(Model theModel,HttpServletRequest req) {
		if (req.getSession().getAttribute("user")!=null) {
			return "ask";
		}
		return "redirect:/Login";
	}
	
	
	
}
