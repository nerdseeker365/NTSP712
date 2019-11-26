package com.nt.test;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTest {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<>();
		set.add("razole");
		set.add("amalapuram");
		set.add("rajamuntry");
		set.add("kakinada");
		set.add("malkipuram");
		set.add("sakhinetipalli");
		set.forEach(a->{
			System.out.println(a);
		});
		
				
		
	
	}
}
