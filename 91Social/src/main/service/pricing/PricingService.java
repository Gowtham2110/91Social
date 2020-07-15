package main.service.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

import main.model.ComponentPart;
import main.service.Prices;

public abstract class PricingService implements Pricing {

	private Prices prices = new Prices();

	//	Default percentage change is 5% every 6 months from pricing date
	public Double calculatePricingBasedOnDate(Double price, LocalDate date) {

		return calculatePricingBasedOnDate(price, date, 5.0, 6);
	}

	public Double calculatePricingBasedOnDate(Double price, LocalDate date, Double percentageChange, Integer durationInMonths) {

		int months = getMonthDifference(getPrices().getPricingDate(), date);
		Double finalPrice = caluculateRecursingPrice(price, months, percentageChange, durationInMonths);
		return finalPrice;

	}

	public Double getComponentCost(ComponentPart componentPart) {
		double cost = 0.0;
				
		if(componentPart != null && componentPart.getComponentName() != null) {
			double componentFare = 0.0;
			
			switch(componentPart.getComponentName()) {
			
			case BREAK:
				componentFare = getPrices().getCostPerBreak();
				break;
			
			case FORK:
				componentFare = getPrices().getCostPerFork();
				break;
				
			case GEARCONTROL:
				componentFare = getPrices().getCostPerGearControl();
				break;
			
			case HANDLEBARGRIP:
				componentFare = getPrices().getCostPerHandleBarGrip();
				break;
				
			case HEADTUBE:
				componentFare = getPrices().getCostPerHeadTube();
				break;
			
			case SHOCKABSORBER:
				componentFare = getPrices().getCostPerShockAbsorber();
				break;
				
			case CHAIN:
				componentFare = getPrices().getCostPerChain();
				break;
			
			case CRANKARM:
				componentFare = getPrices().getCostPerCrankArm();
				break;
				
			case GEAR:
				componentFare = getPrices().getCostPerGear();
				break;
			
			case PEDAL:
				componentFare = getPrices().getCostPerPedal();
				break;
				
			case FRAME:
				componentFare = getPrices().getCostPerFrameLength();
				break;
			
			case SADDLE:
				componentFare = getPrices().getCostPerSaddle();
				break;
				
			case SEATPOST:
				componentFare = getPrices().getCostPerSeatPost();
				break;
			
			case SPOKES:
				componentFare = getPrices().getCostPerSpokes();
				break;
				
			case RIM:
				componentFare = getPrices().getCostPerRim();
				break;
			
			case TUBELESSTUBE:
				componentFare = getPrices().getCostPerTubelessTube();
				break;
				
			case TUBE:
				componentFare = getPrices().getCostPerTube();
				break;
				
			case TYRE:
				componentFare = getPrices().getCostPerTyre();
				break;
			
			case VALVE:
				componentFare = getPrices().getCostPervalve();
				break;			
			}
			
			if(componentPart.getNoOfComponents() != null) {
				cost += componentPart.getNoOfComponents() * componentFare;
			}
		}	
		return cost;
	}

	
	private int getMonthDifference(LocalDate before, LocalDate now) {
		Period period = Period.between(before, now);
		int years = period.getYears();
		int months = (years * 12) + period.getMonths();
		return months;
	}

	private Double caluculateRecursingPrice(Double price, int monthsDifference, Double percentageChange, int changeDurationInMonths) {
		Double priceRounded = round(price, 2);
			
		if (changeDurationInMonths == 0 || monthsDifference <= changeDurationInMonths) {
			return priceRounded;
		}
		priceRounded = priceRounded * (1 + percentageChange/100);
		return caluculateRecursingPrice(priceRounded, monthsDifference - changeDurationInMonths, percentageChange, changeDurationInMonths);
	}

	private double round(Double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bigDecimal = BigDecimal.valueOf(value);
		bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
		return bigDecimal.doubleValue();
	}
	
	public Prices getPrices() {
		return this.prices;
	}
}
