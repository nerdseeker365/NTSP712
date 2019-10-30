package com.nt.comp;

public final class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine 0-param Constructor");
	}
	@Override
	public void start() {
		System.out.println("Diesel Engine Started....");

	}

	@Override
	public void end() {
		System.out.println("Diesel Engine Stopped....");

	}

}
