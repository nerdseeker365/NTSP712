package com.nt.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTestForEachLoop {

	public static void main(String[] args) {
		HashMap<Object,Object> map=new HashMap<>();
		map.put("Eno  ","2019Te345");
		map.put("Ename","Sankar");
		map.put("Eaddr","Ameerpet");
		//System.out.println(map);
		for(Map.Entry<Object,Object> m:map.entrySet()) {
			Object key=m.getKey();
			Object value=m.getValue();
			System.out.println(key+" = "+value);
		}
	}

}
