package com.nt.beans;

//dependent class
public class DHI {
	// Constructor
	public DHI() {
		System.out.println("DHI 0 paramconstructor::)");
	}

	public String deliver(int oid) {

		return "DHI is delivering " + oid + "order products";
	}

}
