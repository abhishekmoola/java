package com.java.innterfaceexample;

public class ElectricEngine implements Engine{

	@Override
	public void start() {
		System.out.println("my electric engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("my electric engine stopped");
		
	}

	@Override
	public void enginePrice(int PRICE) {
		System.out.println("my electric engine price" + PRICE);
		
	}

}
