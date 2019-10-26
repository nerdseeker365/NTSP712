package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//bean Properties
	private String sname;
	private Date date;
	
	//Parameterized Constructor
	public WishMessageGenerator(String sname,Date date) {
		
		this.sname = sname;
		this.date=date;
	}
	//business logic
	public String GeneraetWishMessage() {
		
		return "Good Morning\t"+sname+"--->"+date;
	}
}
