package com.nt.beans;

//dependent class
public class Bluedart implements Courier{
	// Constructor
	public Bluedart() {
		System.out.println("bluedart 0 paramconstructor::)");
	}

	public String deliver(int oid) {

		return "bluedart is delivering " + oid + "order products";
	}

}
