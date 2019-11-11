package com.nt.test;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list=new Vector<>(10);//capacity of vector
		//List<Object> list=new Vector<>(10,3);//after fill all elements size can be increased by 3
		list.add(1);
		list.add(2);
		System.out.println(((Vector<Object>) list).capacity());//totay 
		System.out.println(list.size());//filled elements
		System.out.println(list);

	}

}
