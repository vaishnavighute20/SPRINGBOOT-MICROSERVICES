package com.micro.calldetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.calldetails.entity.CallDetails;

public interface CallDetailsRepository extends JpaRepository<CallDetails, Long> {

	List<CallDetails> findByCalledBy(Long calledBy);
}
