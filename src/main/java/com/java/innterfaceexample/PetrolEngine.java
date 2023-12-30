package com.java.innterfaceexample;

public class PetrolEngine implements Engine{

	@Override
	public void start() {
		System.out.println("my power engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("my power engine stopped");	
	}

	@Override
	public void enginePrice(int PRICE) {
		System.out.println("my power engine price" + PRICE);
		
	}

}
