//it is pojo class ,java bean,component ,spring bean
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	// property
	Date date;// dependent class
	public WishMessageGenerator() {
		System.out.println("Welcome");
	}

	public void setDate(Date date) {// Setter Method for setter injection
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public String generateMessage(String user) {
		System.out.println("Date:: "+date);
		int hour = 0;
		hour = date.getHours();// 24 hours format
		if (hour < 12)
			return "Good Morning\t"+user;
		else if (hour < 16)
			return "Good AfterNoon\t"+user;
		else if (hour < 20)
			return "Good Evening\t"+user;
		else 
			return "Good Night\t"+user;
	}
}
