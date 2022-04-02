package com.tns.springaw3;

public class Human {

	private Heart heart;// reference to Heart Class

	// DI using constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();// dependency
	}

}
