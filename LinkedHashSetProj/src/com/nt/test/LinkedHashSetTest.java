package com.nt.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
//follows insertion order
	public static void main(String[] args) {
			LinkedHashSet<Object> l=new LinkedHashSet<>();
			l.add(8);
			l.add(6);
			l.add(8);//duplicates not allowed
			Iterator<Object> it=l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
