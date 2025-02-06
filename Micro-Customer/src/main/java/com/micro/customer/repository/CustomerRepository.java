package com.micro.customer.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.micro.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value="select count (*) from customer where phone_no=? and password=? ",nativeQuery = true)
	Integer checkLogin(Long phoneNumber,String password);
	
}
