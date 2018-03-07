package com.network.plans.MobilePlans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.network.plans.MobilePlans.Bean.Plan;

@Service
public class AirtelService implements MobilePlansService {

	private List<Plan> airtelPlans;

	@Autowired
	public AirtelService(@Qualifier("airtel") List<Plan> airtelPlans) {
		super();
		this.airtelPlans = airtelPlans;
	}

	@Override
	public List<Plan> getPlans() {
		return airtelPlans;
	}

}
