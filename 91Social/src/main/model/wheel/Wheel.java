package main.model.wheel;

import main.model.ComponentPart;
import main.model.Components;

public class Wheel implements Components {
	
	private ComponentPart spokes;
	private ComponentPart rim;
	private ComponentPart tube;
	private ComponentPart tyre;
	private ComponentPart valve;
	
	public ComponentPart getSpokes() {
		return spokes;
	}
	public void setSpokes(ComponentPart spokes) {
		this.spokes = spokes;
	}
	public ComponentPart getRim() {
		return rim;
	}
	public void setRim(ComponentPart rim) {
		this.rim = rim;
	}
	
	public ComponentPart getTube() {
		return tube;
	}
	public void setTube(ComponentPart tube) {
		this.tube = tube;
	}
	public ComponentPart getTyre() {
		return tyre;
	}
	public void setTyre(ComponentPart tyre) {
		this.tyre = tyre;
	}
	public ComponentPart getValve() {
		return valve;
	}
	public void setValve(ComponentPart valve) {
		this.valve = valve;
	}
}
