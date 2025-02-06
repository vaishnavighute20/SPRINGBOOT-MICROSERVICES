package com.micro.customer.service;

import com.micro.customer.entity.Customer;
import com.micro.customer.model.CustomerDTO;
import com.micro.customer.model.LoginDTO;
import com.micro.customer.model.RegisterDTO;

public interface ICustomerService {

	boolean registerCustomer(RegisterDTO registerDto);
	boolean loginCustomer(LoginDTO loginDto);
	CustomerDTO readCustomer(Long phoneNumber);
}
