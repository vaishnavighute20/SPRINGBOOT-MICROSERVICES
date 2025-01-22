package com.otm.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.otm.entity.Customer;
import com.otm.entity.Loan;
import com.otm.repository.CustomerRepository;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
    CustomerRepository custrepo;
	@Override
	public void run(String... args) throws Exception {
      Customer c=new Customer();
      c.setCustomerName("Durga");
      Loan personal=new Loan();
      personal.setLoanId("LN_P191");
      personal.setLoanType("Personal");
      personal.setAmount(500000.00);
      
      Loan home=new Loan();
      home.setLoanId("LN_H200");
      home.setLoanType("Home");
      home.setAmount(90000000.00);
      Set<Loan> loans=new HashSet<Loan>( );
      loans.add(personal);
      loans.add(home);
      c.setLoans(loans);
      custrepo.save(c);
      
      
	}

}
