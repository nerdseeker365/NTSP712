package com.nt.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
//keys are unique
	//follows ascending Order
	public static void main(String[] args) {
		TreeMap<String,Object> map=new TreeMap<>();
		map.put("sno",1);
		map.put("sname","Sankar");
		map.put("saddr","appanaramunilanka");
		Set s=map.keySet();
		Iterator<Object> it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str=(String)obj;
			System.out.println(str+"   :  "+map.get(str));
		}
		
	}

}
