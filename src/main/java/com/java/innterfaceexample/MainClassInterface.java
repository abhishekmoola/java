package com.java.innterfaceexample;

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
		
		
		TeslaCar tCar = new TeslaCar();
		tCar.start();
		tCar.stopp();
		tCar.startMedia();
		tCar.stoppMedia();
		tCar.upgradeEngine(new ElectricEngine());
		tCar.start();
		
	}

}
