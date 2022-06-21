package com.tns.Generics;
import java.util.*;
public class GenericsTest2 {
	
	public static void main(String[] args) {
		
		MyGenericsClass<Integer> obj1 = new MyGenericsClass<Integer>();
		obj1.setObject(1000);
		Integer i = obj1.getObject();
		System.out.println(i);
		
		MyGenericsClass<String> obj2 = new MyGenericsClass<String>();
		obj2.setObject("Generics Demo");
		String s = obj2.getObject();
		System.out.println(s);
		
		MyGenericsClass<Double> obj3 = new MyGenericsClass<Double>();
		obj3.setObject(123.50);
		Double d = obj3.getObject();
		System.out.println(d);
		
		
	}
}
