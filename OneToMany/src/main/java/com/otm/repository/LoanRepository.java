package com.otm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otm.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, String> {

}
