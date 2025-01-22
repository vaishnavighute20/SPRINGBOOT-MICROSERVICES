package com.jpa.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.jpa.entity.Passenger;
import com.jpa.repository.PassengerRepository;
@Component
public class MyRunner implements CommandLineRunner {
   @Autowired
   PassengerRepository repository;
	@Override
	public void run(String... args) throws Exception {
  
		/*
		// Insert the records in db
		Passenger p=new Passenger();
 		p.setFirstName("Durga");
		p.setLastName("soft");
		p.setEmail("durga@gmail.com");
		p.setSeatNo(12);
		repository.save(p);
		
		Passenger p1=new Passenger();
 		p1.setFirstName("IACSD");
		p1.setLastName("DAC");
		p1.setEmail("iacsd@gmail.com");
		p1.setSeatNo(13);
		repository.save(p1);
		
	*/
		// find the single record
//		Optional <Passenger> opt=repository.findById(2);
//		Passenger p2=opt.get();
//		System.out.println(p2.getFirstName()+","+p2.getFirstName()+","+p2.getEmail());
		
		
		
		// if we want multiple records
	/*
		List<Passenger> passengerList=repository.findAll();
		passengerList.forEach(passenger->{
			System.out.println( passenger.getFirstName()+","+passenger.getFirstName()+","+passenger.getEmail());
		});
	*/	
		// jpql Approaches
		// Approach I 
		// query creation by method name
//		Passenger p=repository.findByEmail("iacsd@gmail.com");
//		System.out.println(p.getFirstName()+" "+p.getLastName()+" "+p.getSeatNo());

		
		//Approch II
		//Query creation by using @Query
//		List<Passenger> passengerList=repository.getPassengers("Durga","soft");
//		passengerList.forEach(passenger->{
//     	System.out.println(passenger.getFirstName()+" "+passenger.getLastName()+" "+passenger.getSeatNo());
//		});

		
		//Approach III
		//Query creation by using @NamedQuery
		
	//List<Passenger> getPassengerBySeat(@Param("seatno") Integer seatNo);	
		
	}

}
