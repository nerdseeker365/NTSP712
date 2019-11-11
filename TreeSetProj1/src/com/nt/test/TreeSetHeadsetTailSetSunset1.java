package com.nt.test;

import java.util.TreeSet;

public class TreeSetHeadsetTailSetSunset1 {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(1);
		ts.add(7);
		ts.add(4);
		ts.add(8);
		ts.add(3);
		System.out.println("all elements"+ts);//all elements
		
		//TreeSet<Object> ts1=(TreeSet<Object>) ts.headSet(4);//4 under all elements
		//TreeSet<Object> ts1=(TreeSet<Object>) ts.tailSet(4);//4 Above Elements
		TreeSet<Object> ts1=(TreeSet<Object>) ts.subSet(2,8);//between 2 and 8 elements
		System.out.println(ts1);
	}

}
