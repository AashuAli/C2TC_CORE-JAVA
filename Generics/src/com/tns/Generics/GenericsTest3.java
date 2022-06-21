 package com.tns.Generics;
import java.util.*;

public class GenericsTest3 {
	
	public void main(String[] args) {
		
		MyGenericClasss<Integer> obj1 = new MyGenericClasss<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(101);
		list1.add(102);
		
		obj1.setList(list1);
		
		List<Integer> list = obj1.getList();
		list.forEach(System.out::println);
		System.out.println("------------------------");
		
		MyGenericClasss<String> obj2 = new MyGenericClasss<>();
		
		List<String> list2 = new LinkedList<>();
		list2.add("TNS");
		list2.add("COMPANY");
		list2.add("H.K.B.K");
		obj2.setList(list2);
		obj2.getList().forEach(System.out::println);
		
		
	}
}
