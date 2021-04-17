package com.kamleshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kamleshit.Service.DetermineEligibilityService;
import com.kamleshit.binding.CitizenInfo;
import com.kamleshit.binding.PlanInfo;

public class DetermineEligibilityRestController 
{
	@Autowired
	private DetermineEligibilityService eligService;
	
	@PostMapping(value="/determineElig",
			produces= {"application/xml","application/json"},
			consumes= {"application/xml,application/json"})
	public PlanInfo checkPlanEligibility(@RequestBody CitizenInfo indvInfo)throws Exception
	{
		PlanInfo planInfo = eligService.determineEligibility(indvInfo);
		return planInfo;
		
	}
	
	
	
	

}
