package com.nt.test;
import java.util.Scanner;
public class VCTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch==' ') {
				System.out.print(" $");
			}
			else {
				System.out.print("\n @");
			}
					}
		sc.close();
	}

}
