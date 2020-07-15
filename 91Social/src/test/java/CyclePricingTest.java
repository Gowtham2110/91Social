package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.model.ComponentPart;
import main.model.Cycle;
import main.model.CycleParts;
import main.model.chainAssembly.ChainAssembly;
import main.model.frame.Frame;
import main.model.frame.FrameComponent;
import main.model.handleBarComponents.HandleBarComponents;
import main.model.seating.Seating;
import main.model.wheel.Wheel;
import main.service.pricing.CyclePricing;
import main.service.pricing.Pricing;

public class CyclePricingTest {

	@Test
	public void getPricingTest() {
		
		Cycle cycle = new Cycle();
		
		Wheel wheel = new Wheel();
		wheel.setRim(new ComponentPart(CycleParts.RIM, 1));
		wheel.setSpokes(new ComponentPart(CycleParts.SPOKES, 20));
		wheel.setTube(new ComponentPart(CycleParts.TUBELESSTUBE, 1));
		wheel.setTyre(new ComponentPart(CycleParts.TYRE, 1));
		wheel.setValve(new ComponentPart(CycleParts.VALVE, 1));
		
		ChainAssembly chain = new ChainAssembly();
		chain.setChain(new ComponentPart(CycleParts.CHAIN, 1));
		chain.setCrankArm(new ComponentPart(CycleParts.CRANKARM, 1));
		chain.setPedal(new ComponentPart(CycleParts.PEDAL, 1));
		chain.setGear(new ComponentPart(CycleParts.GEAR, 1));
		
		Frame frame = new Frame();
		frame.setChainStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setDownTube(new FrameComponent(3.6, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatStay(new FrameComponent(4.4, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatTube(new FrameComponent(6.5, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setTopTube(new FrameComponent(1.6, new ComponentPart(CycleParts.FRAME, 1)));
		
		HandleBarComponents handleBar = new HandleBarComponents();
		handleBar.setBrake(new ComponentPart(CycleParts.BREAK, 1));
		handleBar.setFork(new ComponentPart(CycleParts.FORK, 1));
		handleBar.setGearControl(new ComponentPart(CycleParts.GEARCONTROL, 1));
		handleBar.setHandleBarGrip(new ComponentPart(CycleParts.HANDLEBARGRIP, 1));
		handleBar.setHeadTube(new ComponentPart(CycleParts.HEADTUBE, 1));
		handleBar.setShockAbsorber(new ComponentPart(CycleParts.SHOCKABSORBER, 1));
		
		Seating seating = new Seating();
		seating.setSaddle(new ComponentPart(CycleParts.SADDLE, 1));
		seating.setSeatPost(new ComponentPart(CycleParts.SEATPOST, 1));
		
		cycle.setWheel(wheel);
		cycle.setChainAssembly(chain);
		cycle.setFrame(frame);
		cycle.setHandleBarComponents(handleBar);
		cycle.setSeating(seating);

		Pricing pricing;
		pricing = new CyclePricing();
		Double finalPrice = pricing.getPricing(cycle);
		assertEquals(2051.70, finalPrice);
	}
	
	@Test
	public void getPricingBasedOnDateTest() {
		
		Cycle cycle = new Cycle();
		
		Wheel wheel = new Wheel();
		wheel.setRim(new ComponentPart(CycleParts.RIM, 1));
		wheel.setSpokes(new ComponentPart(CycleParts.SPOKES, 20));
		wheel.setTube(new ComponentPart(CycleParts.TUBELESSTUBE, 1));
		wheel.setTyre(new ComponentPart(CycleParts.TYRE, 1));
		wheel.setValve(new ComponentPart(CycleParts.VALVE, 1));
		
		ChainAssembly chain = new ChainAssembly();
		chain.setChain(new ComponentPart(CycleParts.CHAIN, 1));
		chain.setCrankArm(new ComponentPart(CycleParts.CRANKARM, 1));
		chain.setPedal(new ComponentPart(CycleParts.PEDAL, 1));
		chain.setGear(new ComponentPart(CycleParts.GEAR, 1));
		
		Frame frame = new Frame();
		frame.setChainStay(new FrameComponent(4.0, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setDownTube(new FrameComponent(3.6, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatStay(new FrameComponent(4.4, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setSeatTube(new FrameComponent(6.5, new ComponentPart(CycleParts.FRAME, 1)));
		frame.setTopTube(new FrameComponent(1.6, new ComponentPart(CycleParts.FRAME, 1)));
		
		HandleBarComponents handleBar = new HandleBarComponents();
		handleBar.setBrake(new ComponentPart(CycleParts.BREAK, 1));
		handleBar.setFork(new ComponentPart(CycleParts.FORK, 1));
		handleBar.setGearControl(new ComponentPart(CycleParts.GEARCONTROL, 1));
		handleBar.setHandleBarGrip(new ComponentPart(CycleParts.HANDLEBARGRIP, 1));
		handleBar.setHeadTube(new ComponentPart(CycleParts.HEADTUBE, 1));
		handleBar.setShockAbsorber(new ComponentPart(CycleParts.SHOCKABSORBER, 1));
		
		Seating seating = new Seating();
		seating.setSaddle(new ComponentPart(CycleParts.SADDLE, 1));
		seating.setSeatPost(new ComponentPart(CycleParts.SEATPOST, 1));
		
		cycle.setWheel(wheel);
		cycle.setChainAssembly(chain);
		cycle.setFrame(frame);
		cycle.setHandleBarComponents(handleBar);
		cycle.setSeating(seating);

		LocalDate date = LocalDate.of(2020, 10, 28);
		
		Pricing pricing;
		pricing = new CyclePricing();
		Double finalPrice = pricing.getPricingBasedOnDate(cycle,date);
		assertEquals(2154.29, finalPrice);
	}
}
