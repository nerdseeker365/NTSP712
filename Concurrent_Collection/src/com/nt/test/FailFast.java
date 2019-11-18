package com.nt.test;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Object> it=list.iterator();//iterating over it
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add(5);//adding new element when starts the while loop
			//getting java.util.ConcurrentModificationException error is called fail-fast iterator
		}
	}

}
