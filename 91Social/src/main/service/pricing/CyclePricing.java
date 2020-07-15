package main.service.pricing;

import java.time.LocalDate;

import main.model.Components;
import main.model.Cycle;
import main.model.chainAssembly.ChainAssembly;
import main.model.frame.Frame;
import main.model.handleBarComponents.HandleBarComponents;
import main.model.seating.Seating;
import main.model.wheel.Wheel;

public class CyclePricing extends PricingService {
	
	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		return getPricingBasedOnDate(components, today);
	}

	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {

		Cycle cycle = (Cycle) components;
		Double finalPrice = 0.0;
		Pricing pricing;
		
		ChainAssembly chain = cycle.getChainAssembly();
		if(chain != null) {
			pricing = new ChainPricing();
			finalPrice += pricing.getPricingBasedOnDate(chain, date);
		}
		
		Seating seating = cycle.getSeating();
		if(seating != null) {
			pricing = new SeatPricing();
			finalPrice += pricing.getPricingBasedOnDate(seating, date);
		}
		
		Frame frame = cycle.getFrame();
		if(frame != null) {
			pricing = new FramePricing();
			finalPrice += pricing.getPricingBasedOnDate(frame, date);
		}
		
		HandleBarComponents handleBar = cycle.getHandleBarComponents();
		if(handleBar != null) {
			pricing = new HandleBarPricing();
			finalPrice += pricing.getPricingBasedOnDate(handleBar, date);
		}
		
		Wheel wheel = cycle.getWheel();
		if(wheel != null) {
			pricing = new WheelPricing();
			finalPrice += pricing.getPricingBasedOnDate(wheel, date);
		}	
		return finalPrice;
	}
}
