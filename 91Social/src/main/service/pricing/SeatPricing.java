package main.service.pricing;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.model.ComponentPart;
import main.model.Components;
import main.model.seating.Seating;

public class SeatPricing extends PricingService {

	private final static Logger LOGGER = Logger.getLogger(ChainPricing.class.getName());
	
	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		LOGGER.log(Level.INFO, "Date Parameter is not Passed. Setting it to current date");
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
			
		LOGGER.log(Level.INFO, "Caluculating final price of Seat based on date.");
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
