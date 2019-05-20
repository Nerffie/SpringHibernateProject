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
import com.projet.entity.Portee;
import com.projet.service.HauteurService;

@Controller
@RequestMapping("/Hauteur")
public class HauteurController {
	
	@Autowired
	private HauteurService hauteurService;
	
	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel,HttpServletRequest req) {
		if (req.getSession().getAttribute("user")!=null) {
			theModel.addAttribute("portee", new Portee());
			return new ModelAndView("hauteur","hauteur",new Hauteur());
		}
		return new ModelAndView("redirect:/Login","",null);
	}
	
	
	@PostMapping("")
	public ModelAndView login(@ModelAttribute("hauteur") Hauteur h) {
		
		System.out.println(h.getFp());
		System.out.println(h.getEpaisseurRev());
		
		try {
			h.setHspn(hauteurService.calculerHauteur(h));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView ("hauteur","",null);
		}
		return new ModelAndView("hauteurResultat","hauteur",h);
		
		//userService.saveUser(u);
		
	}
	
	
}
