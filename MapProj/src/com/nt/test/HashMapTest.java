package com.nt.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Object,Object> map=new HashMap<>();
		map.put("Eno","2019Te345");
		map.put("Ename","Sankar");
		map.put("Eaddr","Ameerpet");
		System.out.println(map);
		Iterator<Map.Entry<Object,Object>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
