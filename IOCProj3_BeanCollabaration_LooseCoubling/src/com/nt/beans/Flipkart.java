package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

//Target class
public class Flipkart {
	//DTDC dtdc=new DTDC();
	//Bluedart bd=new Bluedart();
	Courier c;
public Flipkart(Courier c) {
	System.out.println("Flipcart 1 param constructor");
	this.c=c;
}
public String shopping(String[] items,float[] prices) {
	float billamt=0.0f;
	String msg=null;
	int  oid=0;
	for(float price:prices) {
		//generate bill amt
		billamt=billamt+price;
		//generate order id
		 oid=new Random().nextInt(1000);
		//use dependent
		// msg=dtdc.deliver(oid);
		 //msg=bd.deliver(oid);
		 msg=c.deliver(oid);
		}//enhancement for loop
		return Arrays.toString(items)+"items are shopped having bill amt:: "+Arrays.toString(prices)+" with total bill amt:: "+billamt+" delivery status:: " +msg;
}//shopping
}//class
