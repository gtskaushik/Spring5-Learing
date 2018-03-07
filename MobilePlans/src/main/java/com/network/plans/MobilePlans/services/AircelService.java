package com.network.plans.MobilePlans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.network.plans.MobilePlans.Bean.Plan;

@Service
public class AircelService implements MobilePlansService {

	private List<Plan> plans;

	public AircelService(@Qualifier("aircel") List<Plan> plans) {
		super();
		this.plans = plans;
	}

	@Override
	public List<Plan> getPlans() {
		return plans;
	}

}
