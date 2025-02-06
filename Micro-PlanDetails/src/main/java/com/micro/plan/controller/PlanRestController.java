package com.micro.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.plan.model.PlanDTO;
import com.micro.plan.service.IPlanService;

@RestController
public class PlanRestController {
@Autowired
IPlanService service;
@GetMapping("/browzePlans")
public List<PlanDTO> getPlans(){
	return service.getAllPlans();
}
	
@GetMapping("/{planId}")
 public PlanDTO getSpecificPlan(@PathVariable String planId) {
	return service.getSpecificPlan(planId);
}
}
