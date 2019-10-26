package com.nt.beans;

//dependent class
public class DTDC implements Courier{
	// Constructor
	public DTDC() {
		System.out.println("DTDC 0 paramconstructor::)");
	}

	public String deliver(int oid) {

		return "DTDC is delivering " + oid + "order products";
	}

}
