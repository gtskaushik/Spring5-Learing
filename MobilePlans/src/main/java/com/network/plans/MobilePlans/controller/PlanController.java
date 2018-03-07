package com.network.plans.MobilePlans.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.network.plans.MobilePlans.Bean.Plan;
import com.network.plans.MobilePlans.services.AircelService;
import com.network.plans.MobilePlans.services.AirtelService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PlanController {
	
	AirtelService airtelService;
	AircelService aircelService;
	
	@RequestMapping("/airtel")
	public List<Plan> getAirtelPlans() {
		return airtelService.getPlans();
	}
	
	@RequestMapping("/aircel")
	public List<Plan> getAircelPlans() {
		return aircelService.getPlans();
	}

}
