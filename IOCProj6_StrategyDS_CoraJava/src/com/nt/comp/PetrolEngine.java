package com.nt.comp;

public final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine 0-param Constructor");
	}
	@Override
	public void start() {
		System.out.println("Petrol Engine Started.....");

	}

	@Override
	public void end() {
		System.out.println("Petrol Engine Stopped....");

	}

}
