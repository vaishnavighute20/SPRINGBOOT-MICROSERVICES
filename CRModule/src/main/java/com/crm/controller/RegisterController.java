package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crm.dao.IRegisterDao;
import com.crm.model.CustomerBean;
import com.crm.service.EmailService;

import jakarta.validation.Valid;
@Controller
public class RegisterController {

	@Autowired
	EmailService emailService;
	
	@Autowired
     IRegisterDao registerDao;
	//http://localhost:2121/CRM/index
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	       

	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		 CustomerBean customerBean=new CustomerBean();
		 model.addAttribute("custBean",customerBean);
		 return "register";
	} 
	@PostMapping("/save")
	 public String registerCustomer(
	            @Valid @ModelAttribute("custBean") CustomerBean customerBean,
	            BindingResult result,
	            Model model) {
	        if (result.hasErrors()) {
	            return "register";
	}
	else {
		boolean flag =registerDao.saveCustomer(customerBean);
		if(flag==false) {
			model.addAttribute("message","A customer has already register");
			return "register";
		}
		else {
			String name=customerBean.getFirstName()+" "+customerBean.getLastName();
				emailService.sendEmailToCustomer(customerBean.getEmail(),name);	
					return "registrationSuccess";
		}
	}
}
}









