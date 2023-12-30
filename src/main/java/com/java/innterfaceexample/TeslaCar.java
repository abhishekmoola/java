package com.java.innterfaceexample;

public class TeslaCar {
	private Engine engine;
	private Media media;
	
	
	public TeslaCar() {
		this.engine= new PetrolEngine();
		this.media = new CdMedia();
	}
//	public TeslaCar(Engine engine) {
//		this.engine=  engine;
//	}
	
	
	
	
//	public TeslaCar(Engine engine , CdMedia media) {
//		this.engine = new ElectricEngine();
//		this.media = new CdMedia();
//	}
	
	
	

	void start() {
		engine.start();
	}
	
	void stopp() {
		engine.stop();
	}
	
	void startMedia() {
		media.start();
	}
	
	void stoppMedia() {
		media.stop();
	}
	
	void upgradeEngine(Engine engine) {
		this.engine= engine;
				System.out.println(engine);
	}

}
