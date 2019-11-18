package com.nt.test;

public class String_count {

	public static void main(String[] args) {
		String str="programs area";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='r') {
				count++;
			}
		}
		System.out.println(count);
	}

}
