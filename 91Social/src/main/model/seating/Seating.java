package main.model.seating;

import main.model.ComponentPart;

public class Seating {
	
	private ComponentPart saddle;
	private ComponentPart seatPost;
	
	public ComponentPart getSaddle() {
		return saddle;
	}
	public void setSaddle(ComponentPart saddle) {
		this.saddle = saddle;
	}
	public ComponentPart getSeatPost() {
		return seatPost;
	}
	public void setSeatPost(ComponentPart seatPost) {
		this.seatPost = seatPost;
	}

	
}
