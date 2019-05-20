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

import com.projet.entity.Hauteur;
import com.projet.entity.Litrage;
import com.projet.entity.Portee;
import com.projet.service.LitrageService;
import com.projet.service.UserService;

@Controller
@RequestMapping("/Litrage")
public class LitrageController {

	@Autowired
	private LitrageService litrageService;
	
	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel,HttpServletRequest req) {
		if (req.getSession().getAttribute("user")!=null) {
			//theModel.addAttribute("portee", new Portee());
			return new ModelAndView("litrage","litrage",new Litrage());
		}
		return new ModelAndView("redirect:/Login","",null);
	}
	
	
	@PostMapping("")
	public ModelAndView login(@ModelAttribute("litrage") Litrage l) {
		
		System.out.println(l.getConsommation());
		System.out.println(l.getEpaisseurY());
		System.out.println(l.getSuperficie());
		
		litrageService.calculerLitrage(l);

		return new ModelAndView("litrage","",null);
		
		//userService.saveUser(u);
		
	}
}
