package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;

public class SwapOfTwoWords {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");
		for(String s:list) {
		System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------");
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
			}
		System.out.println("-------------------------------------------------------------");
		Collections.reverse(list);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------------------------------");
	Collections.swap(list,0,1);
	for(String s:list) {
		System.out.println(s);
	}
	System.out.println("-------------------------------------------------------------");
	System.out.println(Collections.max(list));;
	
	System.out.println("-------------------------------------------------------------");
	System.out.println(Collections.min(list));;
	
	}

}
