package com.flyaway.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.flyaway.AdminDao.AdminDao;
import com.flyaway.admin.Admin;

@Controller
public class Controllerclass {
	
	@Autowired
	private AdminDao adminDao;
	
	@RequestMapping("/log")
	public String loginform() {
		
		
		return "login";
	}
	
	@RequestMapping("/admin")
	public String adminform(Model m) {
		
		m.addAttribute("title","BACK");
		return "adminform";
	}
	
	@RequestMapping("/report")
	public String home(Model m) {
		List<Admin>admins=adminDao.getAdmins();
		m.addAttribute("admins", admins);
		
		
		return "index";
	}
	
	
	
	@RequestMapping(path = "/next" , method=RequestMethod.POST)
	public String isValid(@RequestParam("name") String name, @RequestParam("password") String password , Model model,ModelMap map) {
		
		String ic="invalidcredential";
		
		
		
		
		if(name.equalsIgnoreCase("admin") && password.equals("qwerty"))
		{
			model.addAttribute("name",name);
			model.addAttribute("password" , password);
			
			return "adminform";
		}
		else {
			model.addAttribute("errorMessage" , ic);
			
		}
		return "login";
			
			}

	@RequestMapping(value = "/handleadmin" , method=RequestMethod.POST)
	public RedirectView handleAdmin(@ModelAttribute Admin admin , HttpServletRequest request , Model model) {
		String iv="field is empty";
		RedirectView redirectView = new RedirectView();
		if(admin.getClasses().isBlank()) {
			redirectView.setUrl(request.getContextPath()+ "/admin");
			
			model.addAttribute("error" , iv);
			return redirectView;
			
		}
		if(admin.getStudent().isBlank()) {
			redirectView.setUrl(request.getContextPath()+ "/admin");
			
			model.addAttribute("error" , iv);
			return redirectView;
			
		}
		if(admin.getTeacher().isBlank()) {
			redirectView.setUrl(request.getContextPath()+ "/admin");
			
			model.addAttribute("error" , iv);
			return redirectView;
		}
		if(admin.getSubject().isBlank()) {
			redirectView.setUrl(request.getContextPath()+ "/admin");
			
			model.addAttribute("error" , iv);
			return redirectView;
			
		}
		
		
		
		adminDao.createAdmin(admin);
		
		redirectView.setUrl(request.getContextPath()+ "/report");
		return redirectView;
		
	}
	
	

}
