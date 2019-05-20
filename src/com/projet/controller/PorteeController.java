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
import com.projet.entity.*;

import com.projet.entity.Utilisateur;
import com.projet.service.PorteeService;
import com.projet.service.UserService;

@Controller
@RequestMapping("/Portee")
public class PorteeController {
	
	@Autowired
	private PorteeService porteeService;


	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel,HttpServletRequest req) {
		
		if (req.getSession().getAttribute("user")!=null) {
			theModel.addAttribute("portee", new Portee());
			return new ModelAndView("portee","portee",new Portee());
		}
		return new ModelAndView("redirect:/Login","",null);
		
	}
	
	@PostMapping("")
	public String login(@ModelAttribute("portee") Portee p) {
		int charge = porteeService.chargeColumn(p.getCharge());
		int epaisseurY = porteeService.getEpaisseurY(p.getEpaisseurX(), p);
		System.out.println(porteeService.calculerPortee(p.getEpaisseurX(), epaisseurY, charge));
		return "portee";
		
		//userService.saveUser(u);
		
	}
	
	
	
}
