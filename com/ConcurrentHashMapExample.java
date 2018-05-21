package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		//ConcurrentHashMap
		Map<String,String> concurrentMap = new ConcurrentHashMap<String,String>();
		concurrentMap.put("1", "emp1");
		concurrentMap.put("2", "emp2");
		concurrentMap.put("3", "emp3");
		
		System.out.println("ConcurrentHashMap before iterator: "+concurrentMap);
		Iterator<String> it = concurrentMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("2")) concurrentMap.put(key+"new", "emp12");
		}
		
		
		System.out.println("ConcurrentHashMap after iterator: "+concurrentMap);

		//HashMap
		Map<String,String> hasMap = new HashMap<String,String>();
		hasMap.put("1", "emp4");
		hasMap.put("2", "emp5");
		hasMap.put("3", "emmp6");
		
		System.out.println("HashMap before iterator: "+hasMap);
		Iterator<String> it1 = hasMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("2")) hasMap.put(key+"new", "emp12");
		}
		System.out.println("HashMap after iterator: "+hasMap);
	}

}
