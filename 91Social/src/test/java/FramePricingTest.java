package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.model.ComponentPart;
import main.model.CycleParts;
import main.model.frame.Frame;
import main.model.frame.FrameComponent;
import main.service.pricing.FramePricing;
import main.service.pricing.Pricing;

public class FramePricingTest {

	@Test
	public void getPricingTest1() {
		
		Frame frame = new Frame();
		frame.setChainStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setDownTube(new FrameComponent(3.6, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatStay(new FrameComponent(4.4, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatTube(new FrameComponent(6.5, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setTopTube(new FrameComponent(1.6, new ComponentPart(CycleParts.FRAME, 1)));
		
		Pricing pricing;
		pricing = new FramePricing();
		Double finalPrice = pricing.getPricing(frame);
		assertEquals(341.70, finalPrice);
	}
	
	@Test
	public void getPricingTest2() {

		Frame frame = new Frame();
		frame.setChainStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setDownTube(new FrameComponent(8.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatTube(new FrameComponent(5.2, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setTopTube(new FrameComponent(2.4, new ComponentPart(CycleParts.FRAME, 1)));
		
		Pricing pricing;
		pricing = new FramePricing();
		Double finalPrice = pricing.getPricing(frame);
		assertEquals(401.20, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		Frame frame = new Frame();
		frame.setChainStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setDownTube(new FrameComponent(8.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatTube(new FrameComponent(5.2, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setTopTube(new FrameComponent(2.4, new ComponentPart(CycleParts.FRAME, 1)));
		
		LocalDate date = LocalDate.of(2020, 10, 28);
		
		Pricing pricing;
		pricing = new FramePricing();
		Double finalPrice = pricing.getPricingBasedOnDate(frame, date);
		assertEquals(421.26, finalPrice);
	}
}
