package com.nt.list;

import java.util.ArrayList;
import java.util.List;
//list interface implemented classes are index based 
//it is allowed duplicates 
//it is sorted order ...means which order you place that order only print.
//random access .
public class ListMethodsCheck {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("sankar");
		list.add(123);
		list.add(0,"welcome");//add element in the which position you want 
		//list.clear();//it is used to remove all of the elements from the list
		//System.out.println(list.removeAll(list));
		list.set(1,"raja");//index based replace the element 
		//System.out.println(list.subList(0, 1));//dispay elements between range
		System.out.println(list.size());//it displays size of the list 
		System.out.println(list);

	}

}
