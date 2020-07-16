package main.service.pricing;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.model.ComponentPart;
import main.model.Components;
import main.model.chainAssembly.ChainAssembly;

public class ChainPricing extends PricingService {
	private final static Logger LOGGER = Logger.getLogger(ChainPricing.class.getName());

	@Override
	public Double getPricing(Components components) {
		LocalDate today = LocalDate.now();
		LOGGER.log(Level.INFO, "Date Parameter is not Passed. Setting it to current date");
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
		
		LOGGER.log(Level.INFO, "Caluculating final price of Chain based on date.");
		finalPrice = calculatePricingBasedOnDate(finalPrice, date);
		return finalPrice;
	}
}
