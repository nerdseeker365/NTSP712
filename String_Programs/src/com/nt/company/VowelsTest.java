package com.nt.company;

import java.util.Scanner;

//Write a java program to print VOWELS in a given String...
public class VowelsTest {

	public static void main(String[] args) { 
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Sentence::");
		String str = sc.next();// next() method reads one word
		// String str=sc.nextLine();//reads sentences
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("number of vowels in the given sentence is::: \t" + count);
	}

}
