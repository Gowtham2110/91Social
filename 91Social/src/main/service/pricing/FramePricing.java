package main.service.pricing;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.model.ComponentPart;
import main.model.Components;
import main.model.frame.Frame;
import main.model.frame.FrameComponent;

public class FramePricing extends PricingService {

	private final static Logger LOGGER = Logger.getLogger(ChainPricing.class.getName());
	
	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		LOGGER.log(Level.INFO, "Date Parameter is not Passed. Setting it to current date");
		return getPricingBasedOnDate(components, today);
	}

	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {
		Frame frame = (Frame) components;
		Double finalPrice = 0.0;

		FrameComponent chainStay = frame.getChainStay();
		if(chainStay != null) {
			finalPrice += getPricingForComponent(chainStay);
		}
		
		FrameComponent downTube = frame.getDownTube();
		if(downTube != null) {
			finalPrice += getPricingForComponent(downTube);
		}
		
		FrameComponent seatStay = frame.getSeatStay();
		if(seatStay != null) {
			finalPrice += getPricingForComponent(seatStay);
		}
		
		FrameComponent seatTube = frame.getSeatTube();
		if(seatTube != null) {
			finalPrice += getPricingForComponent(seatTube);
		}
		
		FrameComponent topTube = frame.getTopTube();
		if(topTube != null) {
			finalPrice += getPricingForComponent(topTube);
		}

		LOGGER.log(Level.INFO, "Caluculating final price of cycle frame based on date.");
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}

	private Double getPricingForComponent(FrameComponent frameComponent) {
		Double finalPrice = 0.0;

		ComponentPart component =  frameComponent.getComponent();
		Double frameLength = frameComponent.getFrameLength();
		
		if(component != null && frameLength != null) {
			finalPrice += getComponentCost(component) * frameLength;
		}
		return finalPrice;
	}
}
