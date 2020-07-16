/**
 * 
 */
package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

/**
 * @author Gowtham
 *
 */
public class CycleMain {

		private final static Logger LOGGER = Logger.getLogger(CycleMain.class.getName());

	/**
	 * @param args
	 * 1st argument is List of Constituent parts with comma (",") separated
	 *  2nd argument is the Date of Pricing
	 */
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			for (String arg : args) {
				LOGGER.log(Level.INFO, "Arguments passed are: " + arg);
			}

			if(args.length != 2) {
			//	 1st argument is List of Constituent parts with comma (",") separated
			//	 2nd argument is the Date of Pricing
				LOGGER.log(Level.SEVERE, "Invalid number of arguments");
				return;
			}

			InputCriteriaConveter converter = new InputCriteriaConveter();
			String constituents = args[0];
			converter.convertInputCriteriaToModel(constituents);
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date = LocalDate.parse(args[1], formatter);

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

			} catch(DateTimeParseException exception) {
				LOGGER.log(Level.SEVERE, "Date is not in YYYY-MM-DD format");
				LOGGER.log(Level.INFO, "Exiting");
				return;
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
			throw new CyclePricingRuntimeException(exception.getMessage(), exception.getCause());
		}
	}
}
