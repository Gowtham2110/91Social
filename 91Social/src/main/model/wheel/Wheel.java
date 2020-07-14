package main.model.wheel;

import main.model.ComponentPart;

public class Wheel {
	
	private Spokes spokes;
	private ComponentPart rim;
	private Tube tube;
	private ComponentPart tyre;
	private ComponentPart valve;
	
	public Spokes getSpokes() {
		return spokes;
	}
	public void setSpokes(Spokes spokes) {
		this.spokes = spokes;
	}
	public ComponentPart getRim() {
		return rim;
	}
	public void setRim(ComponentPart rim) {
		this.rim = rim;
	}
	public Tube getTube() {
		return tube;
	}
	public void setTube(Tube tube) {
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
