package com.nt.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
//Duplicates are not allowed
	//Sorting (Ascending order)
	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(1);
		ts.add(7);
		ts.add(0);
		ts.add(4);
		//Iterator<Object> it=ts.iterator();//ascending
		Iterator<Object> it=ts.descendingIterator();//descending order
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
