package com.nt.comp;

public final class Vehicle {
	Engine engine=null;
	public Vehicle() {
		System.out.println("Vehicle 0-param Constructor");
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public void journey(String start,String end) {
		engine.start();
		System.out.println("vehicle started from\t"+start+"\tplace");
		System.out.println("Journey is going on....");
		engine.end();
		System.out.println("vehicle stopped at\t"+end+"\tplace");
		System.out.println("journey completed......");
	}
}
