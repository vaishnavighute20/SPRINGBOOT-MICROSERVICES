package com.otm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
