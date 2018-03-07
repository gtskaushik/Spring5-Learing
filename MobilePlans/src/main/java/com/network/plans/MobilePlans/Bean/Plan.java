package com.network.plans.MobilePlans.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class Plan {

	private String name;
	private int rentalPrice;
	private int rentalDays;
}
