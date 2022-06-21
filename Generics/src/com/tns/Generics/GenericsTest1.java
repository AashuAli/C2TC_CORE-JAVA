package com.tns.Generics;
import java.util.*;
public class GenericsTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
	// list.add(new Integer(100));
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String data = itr.next();
			System.out.println(data);
		}
		
	}
}
