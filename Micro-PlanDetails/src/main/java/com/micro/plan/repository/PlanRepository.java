package com.micro.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, String> {

}
