package com.jpa.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	 // Passenger findbyEmail(String email); not allowed    use camelcasing  should be match with entity class
	  Passenger findByEmail(String email);

	 
	  
//	  @Query("SELECT p FROM Passenger p WHERE p.firstName = ?1 AND p.lastName = ?2")
//	  List<Passenger> getPassengers(String firstName, String lastName);

	  
	  
}
