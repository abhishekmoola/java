package com.java.innterfaceexample;

public class Car implements Break, Engine, Media{

	@Override
	public void start() {
		System.out.println("I'm starting my car");
		
	}

	@Override
	public void stop() {
		System.out.println("I'm stoping my car");
		
	}

	@Override
	public void enginePrice(int PRICE) {
		System.out.println(" my car price " + PRICE);
		
	}

	@Override
	public void brake() {
		System.out.println("Im using  my car brakes");
		
	}
	
	

}
