package main.model.chainAssembly;

import main.model.ComponentPart;
import main.model.Components;

public class ChainAssembly implements Components {
	
	private ComponentPart pedal;
	private ComponentPart crankArm;
	private ComponentPart chain;
	private ComponentPart gear;
	
	public ComponentPart getPedal() {
		return pedal;
	}
	public void setPedal(ComponentPart pedal) {
		this.pedal = pedal;
	}
	public ComponentPart getCrankArm() {
		return crankArm;
	}
	public void setCrankArm(ComponentPart crankArm) {
		this.crankArm = crankArm;
	}
	public ComponentPart getChain() {
		return chain;
	}
	public void setChain(ComponentPart chain) {
		this.chain = chain;
	}
	public ComponentPart getGear() {
		return gear;
	}
	public void setGear(ComponentPart gear) {
		this.gear = gear;
	}
}
