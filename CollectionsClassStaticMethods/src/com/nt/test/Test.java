package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("ravi");
		list.add("devi");
		list.add("saranya");
		list.add("meghana");
		//Collections.sort(list);//ascending order
		//Collections.reverse(list);//reverse order
		Collections.swap(list, 0,1);//swap of two names
		System.out.println(Collections.min(list));//minimum value
		System.out.println(Collections.max(list));//maximum value
		System.out.println(list);
	}

}
