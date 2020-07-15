package main.service.pricing;

import java.time.LocalDate;

import main.model.ComponentPart;
import main.model.Components;
import main.model.handleBarComponents.HandleBarComponents;

public class HandleBarPricing extends PricingService {

	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		return getPricingBasedOnDate(components, today);
	}

	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {
		HandleBarComponents handleBar = (HandleBarComponents) components;
		Double finalPrice = 0.0;

		ComponentPart breaks = handleBar.getBrake();
		if(breaks != null) {
			finalPrice += getComponentCost(breaks);
		}

		ComponentPart fork = handleBar.getFork();
		if(fork != null) {
			finalPrice += getComponentCost(fork);
		}
		
		ComponentPart gearControl = handleBar.getGearControl();
		if(gearControl != null) {
			finalPrice += getComponentCost(gearControl);
		}

		ComponentPart grip = handleBar.getHandleBarGrip();
		if(grip != null) {
			finalPrice += getComponentCost(grip);
		}
		
		ComponentPart headTube = handleBar.getHeadTube();
		if(headTube != null) {
			finalPrice += getComponentCost(headTube);
		}

		ComponentPart shockAbsorber = handleBar.getShockAbsorber();
		if(shockAbsorber != null) {
			finalPrice += getComponentCost(shockAbsorber);
		}
		
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
