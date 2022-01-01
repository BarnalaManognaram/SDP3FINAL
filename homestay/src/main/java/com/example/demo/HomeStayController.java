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
		@Autowired ChecknowService cservice;
		
	
	@RequestMapping("/")  
	public String login(Model model)  
	{
		return "login.html";
	}

	@RequestMapping("/places")  
	public String places(Model model)  
	{
		return "places.html";
	}
	@RequestMapping("/main")  
	public String main(Model model)  
	{
		return "main.html";
	}
	@RequestMapping("/signup")  
	public String signup(@RequestParam("uname") String name,@RequestParam("email") String uemail,@RequestParam("pass") String pwd)  
	{
		
		User u=new User();
		u.setUname(name);
		u.setEmail(uemail);
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
	
	@RequestMapping("/invalidSignup")
		public String InvalidSignup(Model model) {
		return "InvalidSignup.html";
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

	@RequestMapping("/checknow")  
	public String Checkout(Model model)  
	{
		return "Checkout.html";
	}

	@RequestMapping("/checknowdata")
	public String CheckNowData(@RequestParam("fname") String fname,@RequestParam("email") String email,@RequestParam("addrs") String addrs,@RequestParam("city") String city,@RequestParam("home") String home) {
		CheckNow ch=new CheckNow();
		ch.setFname(fname);
		ch.setEmail(email);
		ch.setAddrs(addrs);
		ch.setCity(city);
		ch.setHome(home);
		cservice.saveData(ch);
		return "redirect:/";
		
	}
}

