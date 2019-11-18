package com.nt.test;

public class First_And_Last_Characters_Of_Given_String {

	public static void main(String[] args) {
		String str="Protect Technologies";
		int n=str.length();
		System.out.println(str.charAt(0));//first character of given String
		System.out.println(str.charAt(n-1));//n-1 means last character in given string
	}

}
