package main.service.pricing;

import java.time.LocalDate;

import main.model.ComponentPart;
import main.model.Components;
import main.model.seating.Seating;

public class SeatPricing extends PricingService {

	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		return getPricingBasedOnDate(components, today);
	}
	
	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {
		Seating seating = (Seating) components;
		Double finalPrice = 0.0;
		
		ComponentPart saddle = seating.getSaddle();
		if(saddle != null) {
			finalPrice += getComponentCost(saddle);
		}
		
		ComponentPart seatPost = seating.getSeatPost();
		if(seatPost != null) {
			finalPrice += getComponentCost(seatPost);
		}
				
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
