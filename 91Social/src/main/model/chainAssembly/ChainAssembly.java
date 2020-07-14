package main.model.chainAssembly;

import main.model.ComponentPart;

public class ChainAssembly {
	
	private ComponentPart pedal;
	private ComponentPart crankArm;
	private ComponentPart chain;
	private Gear gear;
	
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
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	
	
}
