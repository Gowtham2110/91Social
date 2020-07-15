package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.model.ComponentPart;
import main.model.CycleParts;
import main.model.wheel.Wheel;
import main.service.pricing.Pricing;
import main.service.pricing.WheelPricing;

public class WheelPricingTest {
	
	@Test
	public void getPricingTest1() {
		
		Wheel wheel = new Wheel();
		wheel.setRim(new ComponentPart(CycleParts.RIM, 1));
		wheel.setSpokes(new ComponentPart(CycleParts.SPOKES, 20));
		wheel.setTube(new ComponentPart(CycleParts.TUBELESSTUBE, 1));
		wheel.setTyre(new ComponentPart(CycleParts.TYRE, 1));
		wheel.setValve(new ComponentPart(CycleParts.VALVE, 1));

		Pricing pricing;
		pricing = new WheelPricing();
		Double finalPrice = pricing.getPricing(wheel);
		assertEquals(655.00, finalPrice);
	}
	
	@Test
	public void getPricingTest2() {
		
		Wheel wheel = new Wheel();
		wheel.setRim(new ComponentPart(CycleParts.RIM, 2));
		wheel.setSpokes(new ComponentPart(CycleParts.SPOKES, 40));
		wheel.setTube(new ComponentPart(CycleParts.TUBELESSTUBE, 2));
		wheel.setTyre(new ComponentPart(CycleParts.TYRE, 2));

		Pricing pricing;
		pricing = new WheelPricing();
		Double finalPrice = pricing.getPricing(wheel);
		assertEquals(1280.00, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		Wheel wheel = new Wheel();
		wheel.setRim(new ComponentPart(CycleParts.RIM, 1));
		wheel.setSpokes(new ComponentPart(CycleParts.SPOKES, 20));
		wheel.setTube(new ComponentPart(CycleParts.TUBELESSTUBE, 1));
		wheel.setTyre(new ComponentPart(CycleParts.TYRE, 1));
		wheel.setValve(new ComponentPart(CycleParts.VALVE, 1));

		LocalDate date = LocalDate.of(2020, 10, 28);
		
		Pricing pricing;
		pricing = new WheelPricing();
		Double finalPrice = pricing.getPricingBasedOnDate(wheel, date);
		assertEquals(687.75, finalPrice);
	}
}
