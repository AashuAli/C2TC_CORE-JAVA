package com.tns.Collection;
import java.util.*;
public class MapInterface {

	public static void main(String[] args) {
		Map <String,String> mapObj= new HashMap<>();
		mapObj.put("First", "Professor");
		mapObj.put("500", "berlin");
		mapObj.put("Third", "tokyo");
		mapObj.put("Fourth", "nairobi");
		mapObj.put("Fifth", "nairobi"); // key are unique, values duplicated
		System.out.println(mapObj); //insertion order is not preserved
		System.out.println(mapObj.get("Third")); //used to retrieve the value
		System.out.println(mapObj.get("tokyo")); // no key called tokyo so it  will show null
		System.out.println(mapObj.get(500));
		System.out.println(mapObj.get("500"));
	}

}
