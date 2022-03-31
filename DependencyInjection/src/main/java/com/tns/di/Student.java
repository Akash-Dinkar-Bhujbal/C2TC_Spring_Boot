package com.tns.di;

public class Student {
//	MathCheat chit = new MathCheat();
	private MathCheat chit;

	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	void cheating() {
		chit.mathcheat();// some other class
	}
}
