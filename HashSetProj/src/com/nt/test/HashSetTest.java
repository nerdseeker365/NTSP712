package com.nt.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		//insertion order not follow
		//not Synchronized
		HashSet<Object> hr=new HashSet<>();
		hr.add("sankar");
		hr.add("prasad");
		hr.add("ravi");
		hr.add("ravi");//duplicates not print
		Iterator<Object> it=hr.iterator();
		String name=(String) it.next();
		if("prasad".equals(name)) {
			System.out.println(name);
		}
		
		while(it.hasNext()) {
			//System.out.println(it.next());
		}

	}

}
