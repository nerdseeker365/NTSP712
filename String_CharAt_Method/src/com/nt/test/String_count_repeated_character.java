package com.nt.test;

public class String_count_repeated_character {

	public static void main(String[] args) {
		String str="welcome to lab";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='t') {
				count++;
			}
		}
		System.out.println(count);
	}

}
