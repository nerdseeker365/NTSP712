package com.nt.beans;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "BlueDart is delivering  "+oid+" order id products";
	}

}
