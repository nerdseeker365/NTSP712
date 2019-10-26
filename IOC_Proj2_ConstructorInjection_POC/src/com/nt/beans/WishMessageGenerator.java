package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//Bean Property
	Date date=null;
	//One Parameter Constructor
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1 parm Constructor");
		this.date=date;
	}
	
	//business method
	public String GenerateWishMessage(String user) {
		System.out.println("Injected Date::"+date);//this line printing date and time
		int hour;
		hour=date.getHours();//24 hours Format
		if(hour<12)
		    return "Good Morning::\t"+user;
		else if(hour<16)
			return "Good Afternoon::\t"+user;
		else if(hour<20)
			return "Good Evening::\t"+user;
		else 
			return "Good Night::\t"+user;
	}//method
}//class
