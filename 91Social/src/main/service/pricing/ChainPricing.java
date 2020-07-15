package main.service.pricing;

import java.time.LocalDate;

import main.model.ComponentPart;
import main.model.Components;
import main.model.chainAssembly.ChainAssembly;

public class ChainPricing extends PricingService {

	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		return getPricingBasedOnDate(components, today);
	}

	@Override
	public Double getPricingBasedOnDate(Components components, LocalDate date) {
		
		ChainAssembly chainAssembly = (ChainAssembly) components;
		Double finalPrice = 0.0;
		
		ComponentPart chain = chainAssembly.getChain();
		if(chain != null) {
			finalPrice += getComponentCost(chain);
		}
		
		ComponentPart crankArm = chainAssembly.getCrankArm();
		if(crankArm != null) {
			finalPrice += getComponentCost(crankArm);
		}
		
		ComponentPart gear = chainAssembly.getGear();
		if(gear != null) {
			finalPrice += getComponentCost(gear);
		}
		
		ComponentPart pedal = chainAssembly.getPedal();
		if(pedal != null) {
			finalPrice += getComponentCost(pedal);
		}
		
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
