package com.tns.springaw2;

public class Human {

	private Heart heart;// reference to Heart Class

	// DI using setter
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();// dependency
	}

}
