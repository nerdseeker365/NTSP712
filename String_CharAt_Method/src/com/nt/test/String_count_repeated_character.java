package com.nt.test;

public class String_count_repeated_character {

	public static void main(String[] args) {
		String str="welcome to lab";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println(count);
	}

}
