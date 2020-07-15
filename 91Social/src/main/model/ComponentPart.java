package main.model;

public class ComponentPart {
	
	private CycleParts componentName;
	private Integer noOfComponents;
		
	public ComponentPart() {
		
	}
	
	public ComponentPart(CycleParts name, Integer noOfComponents) {
		this.componentName = name;
		this.noOfComponents = noOfComponents;
	}
	
	public CycleParts getComponentName() {
		return componentName;
	}
	public void setComponentName(CycleParts componentName) {
		this.componentName = componentName;
	}
	public Integer getNoOfComponents() {
		return noOfComponents;
	}
	public void setNoOfComponents(Integer noOfComponents) {
		this.noOfComponents = noOfComponents;
	}
	
	
	
}
