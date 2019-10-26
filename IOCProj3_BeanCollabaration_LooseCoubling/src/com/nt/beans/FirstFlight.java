package com.nt.beans;

//dependent class
public class FirstFlight implements Courier {
	// Constructor
	public FirstFlight() {
		System.out.println("FirstFlight 0 paramconstructor::)");
	}

	public String deliver(int oid) {

		return "FlightFlight is delivering " + oid + "order products";
	}

}
