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

import com.projet.entity.Admin;
import com.projet.entity.Utilisateur;
import com.projet.service.AdminService;
import com.projet.service.UserService;

@Controller
@RequestMapping("/LoginAdmin")
public class LoginAdminController {



	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("")
	public ModelAndView loginPage(Model theModel) {
		//theModel.addAttribute("utilisateur", new Utilisateur());
		return new ModelAndView("loginAdmin","admin",new Admin());
		
	}
	
	@PostMapping("")
	public String login(@ModelAttribute("admin") Admin u,HttpServletRequest request) {
		Admin admin = adminService.getAdminFromId(u.getId());
		System.out.println(admin);
		if (admin == null) {
			return "loginAdmin";
		}
		if (adminService.passwordMatch(u.getPassword(), admin)) {
			request.getSession().setAttribute("admin", admin);
			return "redirect://UsersData";
		}
		else {
			
			return "loginAdmin";
		}
		//userService.saveUser(u);
		
	}
	
	
	
}
