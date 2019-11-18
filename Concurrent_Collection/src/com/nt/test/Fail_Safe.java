package com.nt.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe {

	public static void main(String[] args) {
		List<Object> list=new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Object> it=list.iterator();//iterating over it
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add(6);//Adding new Element
					}
		
	}

}
