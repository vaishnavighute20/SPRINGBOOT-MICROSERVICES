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
    @Autowired
	LoanRepository loanRepo;

	@Override
    @Transactional
	 public void run(String... args) throws Exception {
   /*    Customer c=new Customer();
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
      */
      
      // to add loan
	/*	Loan vehicle=new Loan();
		vehicle.setLoanId("LN_V365");
		vehicle.setLoanType("VEHICLE");
		vehicle.setAmount(100000.00);
		Customer customer=custrepo.findById(1).get();
		Set<Loan>loans=customer.getLoans();
	    loans.add(vehicle);
	*/     
	  // to delete loan
		Loan loan=loanRepo.findById("LN_V365").get();
		Customer customer=custrepo.findById(1).get();
		Set<Loan>loans=customer.getLoans();
	    Iterator<Loan>iterator=loans.iterator();
	    while(iterator.hasNext())
	    {
	    	Loan ln=iterator.next();
	    	if(ln.getLoanId().equals(loan.getLoanId()))
	    	{
	    		iterator.remove();
	    	}
	    }
		// this is showing in db null now so it is orphan record
	    // previously it is showing 1
	    // if we want to delete entire then in customer class after eager feching add orphanRemoval=true   
	    
	}

}
