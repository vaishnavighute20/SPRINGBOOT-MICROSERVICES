package com.mto.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

 import com.mto.entity.Loan;
import com.mto.repository.CustomerRepository;
import com.mto.repository.LoanRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
LoanRepository loanRepository;
@Autowired
CustomerRepository customerRepository;
	@Override
	
	public void run(String... args) throws Exception {
 
	/*
	    Customer customer=new Customer();
		customer.setCustomerName("Aditya");
		customer.setCustomerId(100);
		Loan personal=new Loan();
		personal.setLoanId("LN_P121");
		personal.setLoanType("PERSONAL");
		personal.setAmount(200000.0);
		
		Loan home=new Loan();
		home.setLoanId("LN_H121");
		home.setLoanType("HOME");
		home.setAmount(50000000.0);
		
		personal.setCustomer(customer);
		home.setCustomer(customer);
		
		loanRepository.save(personal);
		loanRepository.save(home);
		
		*/
		
		//Loan loan=loanRepository.findById("LN_H121").get();
		
		// delete by id
		
		loanRepository.deleteById("LN_H121") ;
        //here we got illegale state exception so in child class make cascadetype=PERSIST to remove excp
	
	
	}

}
