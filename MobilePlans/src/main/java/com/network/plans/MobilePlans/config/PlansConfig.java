package com.network.plans.MobilePlans.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.network.plans.MobilePlans.Bean.Plan;

@Configuration
public class PlansConfig {

	@Bean(name = "airtel")
	@Scope(value = "prototype")
	public List<Plan> getAirtelPlans(){
		List<Plan> plans = new ArrayList<Plan>();
		Plan plan = new Plan("airtelDummy", 199, 30);
		plans.add(plan);
		
		return plans;
	}
	
	@Bean(name = "aircel")
	public List<Plan> getAircelPlans(){
		List<Plan> plans = new ArrayList<Plan>();
		Plan plan = new Plan("aircelDummy", 199, 30);
		plans.add(plan);
		
		return plans;
	}
}
