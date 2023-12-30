package com.java.innterfaceexample;

public class CdMedia implements Media{

	@Override
	public void start() {
		System.out.println("my Music  started");
		
	}

	@Override
	public void stop() {
		System.out.println("my Music  stopped");
		
	}

}
