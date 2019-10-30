package com.nt.comp;

public final class WaterEngine implements Engine {

	public WaterEngine() {
		System.out.println("WaterEngine 0-param Constructor");
	}
	@Override
	public void start() {
		System.out.println("Water Engine is Started....");
	}

	@Override
	public void end() {
		System.out.println("Water Engine Is Stopped....");

	}

}
