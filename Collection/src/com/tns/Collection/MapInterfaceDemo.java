package com.tns.Collection;
import java.util.*;
public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<Integer,String> mapInterface = new HashMap<>();
		mapInterface.put(100,"Aashu");
		mapInterface.put(98,"Capgemini");
		mapInterface.put(89,"They Work togather in the same team");
		System.out.println(mapInterface); // The insertion order is not preserved
		for(Map.Entry m:mapInterface.entrySet()) {
			System.out.println(m.getKey()+"=" +m.getValue()); // to iterate through the entries (key,value)
		}
		Iterator <Integer> iteratorObj = mapInterface.keySet().iterator();
		while(iteratorObj.hasNext()) {
			Integer key=iteratorObj.next();
			System.out.println(key+ " "+mapInterface.get(key));
		}
	}

}
