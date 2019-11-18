package com.nt.test;

public class String_Odd_Index {

	public static void main(String[] args) {
			String str="welcome to lab";
			for(int i=0;i<str.length()-1;i++) {
				if(i%2!=0) {
					System.out.println(i+"  :  "+str.charAt(i));
				}
				
			}
	}

}
