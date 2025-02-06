package com.micro.customer.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.customer.entity.Customer;
import com.micro.customer.model.CustomerDTO;
import com.micro.customer.model.LoginDTO;
import com.micro.customer.model.RegisterDTO;
import com.micro.customer.repository.CustomerRepository;
 import com.micro.customer.service.ICustomerService;

@Service
public class CustomerServiceImpl  implements ICustomerService {

	@Autowired
	CustomerRepository repository;
	@Override
	public boolean registerCustomer(RegisterDTO registerDto) {
		 if (repository.existsById(registerDto.getPhoneNumber())==false) {
	            Customer customer = new Customer();
	            BeanUtils.copyProperties(registerDto, customer);
	            repository.save(customer);
	            return true;
	        } else {
	            return false;
	        }	}

	@Override
	public boolean loginCustomer(LoginDTO loginDto) {
		  if (repository.checkLogin(loginDto.getPhoneNumber(), loginDto.getPassword()) == 1) {
	            return true; 
	        } else {
	            return false;
	        }	}
 
	@Override
	public CustomerDTO readCustomer(Long phoneNumber) {
	    System.out.println("Phone number: " + phoneNumber);
	    
	    return repository.findById(phoneNumber)
	        .map(customer -> {
	            System.out.println("Customer: " + customer);
	            CustomerDTO customerDto = new CustomerDTO();
	            BeanUtils.copyProperties(customer, customerDto);
	            return customerDto;
	        })
	        .orElseThrow(() -> new RuntimeException("Customer not found with phone number: " + phoneNumber));
	}
 
}
