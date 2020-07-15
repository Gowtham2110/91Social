package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import main.model.ComponentPart;
import main.model.CycleParts;
import main.model.chainAssembly.ChainAssembly;
import main.service.pricing.ChainPricing;
import main.service.pricing.Pricing;

public class ChainAssemblyPricingTest {

	@Test
	public void getPricingTest1() {
		
		ChainAssembly chain = new ChainAssembly();
		chain.setChain(new ComponentPart(CycleParts.CHAIN, 1));
		chain.setCrankArm(new ComponentPart(CycleParts.CRANKARM, 1));
		chain.setPedal(new ComponentPart(CycleParts.PEDAL, 1));
		chain.setGear(new ComponentPart(CycleParts.GEAR, 1));

		Pricing pricing;
		pricing = new ChainPricing();
		Double finalPrice = pricing.getPricing(chain);
		assertEquals(570.00, finalPrice);
	}
	
	@Test
	public void getPricingTest2() {
		
		ChainAssembly chain = new ChainAssembly();
		chain.setChain(new ComponentPart(CycleParts.CHAIN, 2));
		chain.setCrankArm(new ComponentPart(CycleParts.CRANKARM, 2));
		chain.setPedal(new ComponentPart(CycleParts.PEDAL, 2));
		chain.setGear(new ComponentPart(CycleParts.GEAR, 2));

		Pricing pricing;
		pricing = new ChainPricing();
		Double finalPrice = pricing.getPricing(chain);
		assertEquals(1140.00, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		ChainAssembly chain = new ChainAssembly();
		chain.setChain(new ComponentPart(CycleParts.CHAIN, 1));
		chain.setCrankArm(new ComponentPart(CycleParts.CRANKARM, 1));
		chain.setPedal(new ComponentPart(CycleParts.PEDAL, 1));
		chain.setGear(new ComponentPart(CycleParts.GEAR, 1));
		
		LocalDate date = LocalDate.of(2020, 10, 28);

		Pricing pricing;
		pricing = new ChainPricing();
		Double finalPrice = pricing.getPricingBasedOnDate(chain, date);
		assertEquals(598.50, finalPrice);
	}
}
