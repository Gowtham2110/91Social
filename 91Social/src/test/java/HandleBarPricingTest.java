package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.model.ComponentPart;
import main.model.CycleParts;
import main.model.handleBarComponents.HandleBarComponents;
import main.service.pricing.HandleBarPricing;
import main.service.pricing.Pricing;

public class HandleBarPricingTest {

	@Test
	public void getPricingTest1() {
		
		HandleBarComponents handleBar = new HandleBarComponents();
		handleBar.setBrake(new ComponentPart(CycleParts.BREAK, 1));
		handleBar.setFork(new ComponentPart(CycleParts.FORK, 1));
		handleBar.setGearControl(new ComponentPart(CycleParts.GEARCONTROL, 1));
		handleBar.setHandleBarGrip(new ComponentPart(CycleParts.HANDLEBARGRIP, 1));
		handleBar.setHeadTube(new ComponentPart(CycleParts.HEADTUBE, 1));
		handleBar.setShockAbsorber(new ComponentPart(CycleParts.SHOCKABSORBER, 1));

		Pricing pricing;
		pricing = new HandleBarPricing();
		Double finalPrice = pricing.getPricing(handleBar);
		assertEquals(355.00, finalPrice);
	}
	
	@Test
	public void getPricingTest2() {
		
		HandleBarComponents handleBar = new HandleBarComponents();
		handleBar.setBrake(new ComponentPart(CycleParts.BREAK, 2));
		handleBar.setFork(new ComponentPart(CycleParts.FORK, 2));
		handleBar.setGearControl(new ComponentPart(CycleParts.GEARCONTROL, 1));
		handleBar.setHandleBarGrip(new ComponentPart(CycleParts.HANDLEBARGRIP, 3));
		handleBar.setShockAbsorber(new ComponentPart(CycleParts.SHOCKABSORBER, 1));

		Pricing pricing;
		pricing = new HandleBarPricing();
		Double finalPrice = pricing.getPricing(handleBar);
		assertEquals(430.00, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		HandleBarComponents handleBar = new HandleBarComponents();
		handleBar.setBrake(new ComponentPart(CycleParts.BREAK, 1));
		handleBar.setFork(new ComponentPart(CycleParts.FORK, 1));
		handleBar.setGearControl(new ComponentPart(CycleParts.GEARCONTROL, 1));
		handleBar.setHandleBarGrip(new ComponentPart(CycleParts.HANDLEBARGRIP, 1));
		handleBar.setHeadTube(new ComponentPart(CycleParts.HEADTUBE, 1));
		handleBar.setShockAbsorber(new ComponentPart(CycleParts.SHOCKABSORBER, 1));

		LocalDate date = LocalDate.of(2021, 10, 28);
		
		Pricing pricing;
		pricing = new HandleBarPricing();
		Double finalPrice = pricing.getPricingBasedOnDate(handleBar, date);
		assertEquals(410.96, finalPrice);
	}
}
