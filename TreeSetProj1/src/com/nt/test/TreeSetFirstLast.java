package com.nt.test;

import java.util.TreeSet;

public class TreeSetFirstLast {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(1);
		ts.add(2);
		System.out.println("Elements::"+ts);
		System.out.println(ts.first());//first element
		System.out.println(ts.last());//last element
	}

}
