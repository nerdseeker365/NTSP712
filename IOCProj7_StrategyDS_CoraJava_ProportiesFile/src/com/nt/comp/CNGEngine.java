package com.nt.comp;

public final class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("CNGEngine 0-param Constructor");
	}
	@Override
	public void start() {
		System.out.println("CNGEngine Started....");

	}

	@Override
	public void end() {
		System.out.println("CNGEngine Stopped....");

	}

}
