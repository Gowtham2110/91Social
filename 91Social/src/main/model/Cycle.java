package main.model;

import main.model.wheel.Wheel;
import main.model.chainAssembly.ChainAssembly;
import main.model.frame.Frame;
import main.model.handleBarComponents.HandleBarComponents;
import main.model.seating.Seating;

public class Cycle {
	
	private Wheel wheel;
	private ChainAssembly chainAssembly;
	private Frame frame;
	private HandleBarComponents handleBarComponents;
	private Seating seating;
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}
	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public HandleBarComponents getHandleBarComponents() {
		return handleBarComponents;
	}
	public void setHandleBarComponents(HandleBarComponents handleBarComponents) {
		this.handleBarComponents = handleBarComponents;
	}
	public Seating getSeating() {
		return seating;
	}
	public void setSeating(Seating seating) {
		this.seating = seating;
	}

}
