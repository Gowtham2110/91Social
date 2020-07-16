package main;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.converter.InputCriteriaConveter;
import main.service.pricing.ChainPricing;
import main.service.pricing.CyclePricing;
import main.service.pricing.FramePricing;
import main.service.pricing.HandleBarPricing;
import main.service.pricing.Pricing;
import main.service.pricing.SeatPricing;
import main.service.pricing.WheelPricing;

public class PricingEngine {

	private final static Logger LOGGER = Logger.getLogger(PricingEngine.class.getName());

	public void calculateEnginePrices(InputCriteriaConveter converter, LocalDate date) {
		try {
			Pricing pricing;

			if(converter.getHandleBar() != null) {
				pricing = new HandleBarPricing();
				double costOfHandleBar = pricing.getPricingBasedOnDate(converter.getHandleBar(), date);
				LOGGER.log(Level.INFO, "Cost Of Handle Bar: " + costOfHandleBar);
			}

			if(converter.getSeating() != null) {
				pricing = new SeatPricing();
				double costOfSeating = pricing.getPricingBasedOnDate(converter.getSeating(), date);
				LOGGER.log(Level.INFO, "Cost Of Seating: " + costOfSeating);
			}

			if(converter.getChainAssembly() != null) {
				pricing = new ChainPricing();
				double costOfChain = pricing.getPricingBasedOnDate(converter.getChainAssembly(), date);
				LOGGER.log(Level.INFO, "Cost Of Chain: " + costOfChain);
			}

			if(converter.getFrame() != null) {
				pricing = new FramePricing();
				double costOfFrame = pricing.getPricingBasedOnDate(converter.getFrame(), date);
				LOGGER.log(Level.INFO, "Cost Of Frame: " + costOfFrame);
			}

			if(converter.getWheel() != null) {
				pricing = new WheelPricing();
				double costOfWheel = pricing.getPricingBasedOnDate(converter.getWheel(), date);
				LOGGER.log(Level.INFO, "Cost Of Wheel: " + costOfWheel);
			}

			if(converter.getCycle() != null) {
				pricing = new CyclePricing();
				double costOfCycle = pricing.getPricingBasedOnDate(converter.getCycle(), date);
				LOGGER.log(Level.INFO, "Cost Of Cycle: " + costOfCycle);
			}

		} catch(Exception exception) {
			exception.printStackTrace();
			throw new CyclePricingRuntimeException(exception.getMessage(), exception.getCause());
		}
	}
}
