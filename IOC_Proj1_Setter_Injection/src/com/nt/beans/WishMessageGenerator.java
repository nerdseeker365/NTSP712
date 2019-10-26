package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {// Pojo class
	// Bean Properties
	String sname;
	Date date;

	public WishMessageGenerator() {
		System.out.println("0-param Constructor");
	}

	// Setter Methods
	public void setSname(String sname) {
		System.out.println("WishMessageGenerato-setName()");
		this.sname = sname;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator-SetDate()");
		this.date = date;
	}

	// Business Method      
	public String GenerateWishMessage() {
		return "Good Morning\t" + sname + "---->" + date;
	}

}
