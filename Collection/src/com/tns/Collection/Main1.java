package com.tns.Collection;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(11);
		list.add(11);
		list.add(100);
		list.remove(3);// to remove value we need to give index number
		for(Integer i: list) { //for each loop to iterate through the collection
			System.out.println(i);
		}
		for(int j=0;j<list.size();j++) { // simple for loop 2nd way
			System.out.println(list.get(j));
		}
		Iterator z=list.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
		}
	}

}
