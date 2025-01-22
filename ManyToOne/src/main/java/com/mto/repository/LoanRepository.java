package com.mto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mto.entity.Loan;
@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {

}
