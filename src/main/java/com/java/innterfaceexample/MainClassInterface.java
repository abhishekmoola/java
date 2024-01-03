package com.java.innterfaceexample;

import java.util.ArrayList;

public class MainClassInterface {
	public static void main(String[] args) {
//		Car car  = new Car();
//		car.brake();
//		car.enginePrice(20);
//		car.start();
//		car.stop();
		
		//what if the two interfaces having same meythods start and stop
		// if a create a media object stop  method it will stop entire car
		// so we need to write a classes for each and every interfaces'\
//		Media media = new Car();
//		media.start();
		//ArrayList<?> a = new ArrayList();
		
		//wrapper class ex it will conert primitive data type to an object
		String s = "123";
		int a = Integer.parseInt(s);
		System.out.println("wrapper class " + s);
		
		TeslaCar tCar = new TeslaCar();
		tCar.start();
		tCar.stopp();
		tCar.startMedia();
		tCar.stoppMedia();
		tCar.upgradeEngine(new ElectricEngine());
		tCar.start();
		
	}

}
