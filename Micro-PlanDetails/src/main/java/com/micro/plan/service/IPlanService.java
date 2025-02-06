package com.micro.plan.service;

import java.util.List;

import com.micro.plan.model.PlanDTO;

public interface IPlanService {

	List<PlanDTO> getAllPlans();
	PlanDTO getSpecificPlan(String planId);
}
