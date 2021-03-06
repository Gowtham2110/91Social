package main.model.frame;

import main.model.ComponentPart;

public class FrameComponent {
	
	private Double frameLength;
	private ComponentPart component;
	
	public FrameComponent() {
		
	}
	
	public FrameComponent(Double length, ComponentPart component) {
		this.frameLength = length;
		this.component = component;
	}
	
	public Double getFrameLength() {
		return frameLength;
	}
	public void setFrameLength(Double frameLength) {
		this.frameLength = frameLength;
	}
	public ComponentPart getComponent() {
		return component;
	}
	public void setComponent(ComponentPart component) {
		this.component = component;
	}	
}
