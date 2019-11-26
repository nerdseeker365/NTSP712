package com.nt.test;

public class StringReverseTest {

	public static void main(String[] args) {
		String s="Welcome to the lab";
		String s1=new StringBuffer(s).reverse().toString();
		System.out.println(s1);
	}
   
}
