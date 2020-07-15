package main.service.pricing;

import java.time.LocalDate;

import main.model.Components;

public interface Pricing {
	
//	if in case we need implementation for pricing irrespective of date
	public Double getPricing(Components components);
	
	public Double getPricingBasedOnDate(Components components, LocalDate date);
	
}
