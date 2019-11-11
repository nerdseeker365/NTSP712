package com.nt.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHeadsetTailSetSunset {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(1);
		ts.add(9);
		ts.add(6);
		ts.add(2);
		ts.add(0);
		//Iterator<Object> it=ts.headSet(4).iterator();//4 below values print
		//Iterator<Object> it=ts.tailSet(5).iterator();//5 above values
		Iterator<Object > it=ts.subSet(1,6).iterator();// 1,6 between elements
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
