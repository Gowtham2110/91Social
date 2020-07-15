package main.service.pricing;

import java.time.LocalDate;

import main.model.ComponentPart;
import main.model.Components;
import main.model.wheel.Wheel;

public class WheelPricing extends PricingService{
	
	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		return getPricingBasedOnDate(components, today);
	}

	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {
		Wheel wheel = (Wheel) components;
		Double finalPrice = 0.0;
		
		ComponentPart rim = wheel.getRim();
		if(rim != null) {
			finalPrice += getComponentCost(rim);
		}
		
		ComponentPart spokes = wheel.getSpokes();
		if(spokes != null) {
			finalPrice += getComponentCost(spokes);
		}
		
		ComponentPart tube = wheel.getTube();
		if(tube != null) {
			finalPrice += getComponentCost(tube);
		}
		
		ComponentPart tyre = wheel.getTyre();
		if(tyre != null) {
			finalPrice += getComponentCost(tyre);
		}
		
		ComponentPart valve = wheel.getValve();
		if(valve != null) {
			finalPrice += getComponentCost(valve);
		}
		
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
