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

				PricingEngine pricingEngine = new PricingEngine();
				pricingEngine.calculateEnginePrices(converter, date);

			} catch(DateTimeParseException exception) {
				LOGGER.log(Level.SEVERE, "Date is not in YYYY-MM-DD format");
				LOGGER.log(Level.INFO, "Exiting");
				return;
			}
		} catch(Exception exception) {
			exception.printStackTrace();
			throw new CyclePricingRuntimeException(exception.getMessage(), exception.getCause());
		}
	}
}
