package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.model.ComponentPart;
import main.model.CycleParts;
import main.model.seating.Seating;
import main.service.pricing.Pricing;
import main.service.pricing.SeatPricing;

public class SeatPricingTest {

	@Test
	public void getPricingTest1() {
		
		Seating seating = new Seating();
		seating.setSaddle(new ComponentPart(CycleParts.SADDLE, 1));
		seating.setSeatPost(new ComponentPart(CycleParts.SEATPOST, 1));

		Pricing pricing;
		pricing = new SeatPricing();
		Double finalPrice = pricing.getPricing(seating);
		assertEquals(130.00, finalPrice);
	}
	
	@Test
	public void getPricingTest2() {
		
		Seating seating = new Seating();
		seating.setSaddle(new ComponentPart(CycleParts.SADDLE, 3));
		seating.setSeatPost(new ComponentPart(CycleParts.SEATPOST, 1));

		Pricing pricing;
		pricing = new SeatPricing();
		Double finalPrice = pricing.getPricing(seating);
		assertEquals(290.00, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		Seating seating = new Seating();
		seating.setSaddle(new ComponentPart(CycleParts.SADDLE, 1));
		seating.setSeatPost(new ComponentPart(CycleParts.SEATPOST, 1));

		LocalDate date = LocalDate.of(2021, 10, 28);
		
		Pricing pricing;
		pricing = new SeatPricing();
		Double finalPrice = pricing.getPricingBasedOnDate(seating, date);
		assertEquals(150.50, finalPrice);
	}
}
