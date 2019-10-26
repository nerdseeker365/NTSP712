package com.nt.basics;

public class PrivateMenmbers {
	//Fields
	private int a=2;
	//Constructors
	private PrivateMenmbers() {
		System.out.println("happy");
	}
	private PrivateMenmbers(String name) {
		System.out.println("Sankar Super");
	}
	//methods
	public String satify() {
		return "Practice Makes Man Perfect..";
	}
}
