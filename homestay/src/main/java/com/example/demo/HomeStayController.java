package com.example.demo;

import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



 


@Controller
public class HomeStayController {
	
	 @Autowired HttpSession session;
	

		@Autowired UserService uservice;
	
	
	@RequestMapping("/")  
	public String login(Model model)  
	{
		return "login.html";
	}
	@RequestMapping("/signup")  
	public String signup(@RequestParam("uname") String name,@RequestParam("email") String email,@RequestParam("pass") String pwd)  
	{
		
		User u=new User();
		u.setUname(name);
		u.setEmail(email);
		u.setPass(pwd);
		uservice.savecustomer(u);
		return "redirect:/";
	}
	@RequestMapping("/signin")
	public String Signin(@RequestParam("uname") String email,@RequestParam("pass") String pwd) {
		try {
		User u=uservice.getCustomer(email);
		String pwd2=u.getPass();
		if(pwd2.matches(pwd)) {
			return "redirect:/home";
		}
		else {
			return "redirect:/";
		}
		}
		catch(Exception e) {
			return "redirect:/";
		}
		
		
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

