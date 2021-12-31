package com.example.demo;

import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



 


@Controller
public class HomeStayController {
	
	 @Autowired HttpSession session;
	
	 
	
	
	@RequestMapping("/")  
	public String login(Model model)  
	{
		return "login.html";
	}
	
	@RequestMapping("/home")  
	public String home(Model model)  
	{
		return "index.html";
	}
	

	@RequestMapping("/about")  
	public String about(Model model)  
	{
		return "about.html";
	}
	
	@RequestMapping("/contact")  
	public String contact(Model model)  
	{
		return "contact.html";
	}
	
	@RequestMapping("/tours")  
	public String tours(Model model)  
	{
		return "tours.html";
	}
	
	@RequestMapping("/thankyou")  
	public String thankyou(Model model)  
	{
		return "thankyou.html";
	}
	
	
}

