package main.service;

import java.time.LocalDate;

public class Prices {
	
//	PRICING WILL BE FETCHED FROM DB IN REAL SCENARIO 
//	THESE PRICING ARE VALID AS ON 01 JAN, 2020
	private LocalDate pricingDate = LocalDate.of(2020, 1, 1);
		
//	DEFAULT WHEEL PRICING
	private Double costPerSpokes = 10.00;
	private Double costPerRim = 90.00;
	private Double costPerTubelessTube = 150.00;
	private Double costPerTube = 100.00;
	private Double costPerTyre= 200.00;
	private Double costPervalve = 15.00;
	
//	DEFAULT SEATING PRICING
	private Double costPerSaddle = 80.00;
	private Double costPerSeatPost = 50.00;
	
//	DEFAULT HANDLE BAR PRICING
	private Double costPerBreak = 30.00;
	private Double costPerFork = 20.00;
	private Double costPerGearControl = 75.00;
	private Double costPerHandleBarGrip = 35.00;
	private Double costPerHeadTube = 45.00;
	private Double costPerShockAbsorber = 150.00;
	
//	DEFAULT FRAME PRICING
	private Double costPerFrameLength = 17.00;
	
//	DEFAULT CHAIN ASSEMBLY PRICING
	private Double costPerChain = 160.00;
	private Double costPerCrankArm = 180.00;
	private Double costPerGear = 150.00;
	private Double costPerPedal = 80.00;

	public LocalDate getPricingDate() {
		return pricingDate;
	}

	public void setPricingDate(LocalDate pricingDate) {
		this.pricingDate = pricingDate;
	}

	public Double getCostPerSpokes() {
		return costPerSpokes;
	}

	public void setCostPerSpokes(Double costPerSpokes) {
		this.costPerSpokes = costPerSpokes;
	}

	public Double getCostPerRim() {
		return costPerRim;
	}

	public void setCostPerRim(Double costPerRim) {
		this.costPerRim = costPerRim;
	}

	public Double getCostPerTubelessTube() {
		return costPerTubelessTube;
	}

	public void setCostPerTubelessTube(Double costPerTubelessTube) {
		this.costPerTubelessTube = costPerTubelessTube;
	}

	public Double getCostPerTube() {
		return costPerTube;
	}

	public void setCostPerTube(Double costPerTube) {
		this.costPerTube = costPerTube;
	}
	
	public Double getCostPerTyre() {
		return costPerTyre;
	}

	public void setCostPerTyre(Double costPerTyre) {
		this.costPerTyre = costPerTyre;
	}

	public Double getCostPervalve() {
		return costPervalve;
	}

	public void setCostPervalve(Double costPervalve) {
		this.costPervalve = costPervalve;
	}

	public Double getCostPerSaddle() {
		return costPerSaddle;
	}

	public void setCostPerSaddle(Double costPerSaddle) {
		this.costPerSaddle = costPerSaddle;
	}

	public Double getCostPerSeatPost() {
		return costPerSeatPost;
	}

	public void setCostPerSeatPost(Double costPerSeatPost) {
		this.costPerSeatPost = costPerSeatPost;
	}

	public Double getCostPerBreak() {
		return costPerBreak;
	}

	public void setCostPerBreak(Double costPerBreak) {
		this.costPerBreak = costPerBreak;
	}

	public Double getCostPerFork() {
		return costPerFork;
	}

	public void setCostPerFork(Double costPerFork) {
		this.costPerFork = costPerFork;
	}

	public Double getCostPerGearControl() {
		return costPerGearControl;
	}

	public void setCostPerGearControl(Double costPerGearControl) {
		this.costPerGearControl = costPerGearControl;
	}

	public Double getCostPerHandleBarGrip() {
		return costPerHandleBarGrip;
	}

	public void setCostPerHandleBarGrip(Double costPerHandleBarGrip) {
		this.costPerHandleBarGrip = costPerHandleBarGrip;
	}

	public Double getCostPerHeadTube() {
		return costPerHeadTube;
	}

	public void setCostPerHeadTube(Double costPerHeadTube) {
		this.costPerHeadTube = costPerHeadTube;
	}

	public Double getCostPerShockAbsorber() {
		return costPerShockAbsorber;
	}

	public void setCostPerShockAbsorber(Double costPerShockAbsorber) {
		this.costPerShockAbsorber = costPerShockAbsorber;
	}

	public Double getCostPerFrameLength() {
		return costPerFrameLength;
	}

	public void setCostPerFrameLength(Double costPerFrameLength) {
		this.costPerFrameLength = costPerFrameLength;
	}

	public Double getCostPerChain() {
		return costPerChain;
	}

	public void setCostPerChain(Double costPerChain) {
		this.costPerChain = costPerChain;
	}

	public Double getCostPerCrankArm() {
		return costPerCrankArm;
	}

	public void setCostPerCrankArm(Double costPerCrankArm) {
		this.costPerCrankArm = costPerCrankArm;
	}

	public Double getCostPerGear() {
		return costPerGear;
	}

	public void setCostPerGear(Double costPerGear) {
		this.costPerGear = costPerGear;
	}

	public Double getCostPerPedal() {
		return costPerPedal;
	}

	public void setCostPerPedal(Double costPerPedal) {
		this.costPerPedal = costPerPedal;
	}
}
