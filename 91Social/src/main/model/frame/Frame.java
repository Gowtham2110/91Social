package main.model.frame;

public class Frame {
	
	private FrameComponent topTube;
	private FrameComponent downTube;
	private FrameComponent seatTube;
	private FrameComponent seatStay;
	private FrameComponent chainStay;
	
	public FrameComponent getTopTube() {
		return topTube;
	}
	public void setTopTube(FrameComponent topTube) {
		this.topTube = topTube;
	}
	public FrameComponent getDownTube() {
		return downTube;
	}
	public void setDownTube(FrameComponent downTube) {
		this.downTube = downTube;
	}
	public FrameComponent getSeatTube() {
		return seatTube;
	}
	public void setSeatTube(FrameComponent seatTube) {
		this.seatTube = seatTube;
	}
	public FrameComponent getSeatStay() {
		return seatStay;
	}
	public void setSeatStay(FrameComponent seatStay) {
		this.seatStay = seatStay;
	}
	public FrameComponent getChainStay() {
		return chainStay;
	}
	public void setChainStay(FrameComponent chainStay) {
		this.chainStay = chainStay;
	}
	
	
}
