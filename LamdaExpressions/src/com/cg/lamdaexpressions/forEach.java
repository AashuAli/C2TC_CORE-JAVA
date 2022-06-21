package com.cg.lamdaexpressions;
import java.util.ArrayList;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("Aashu");
		obj.add("TNS");
		obj.add("HKBK"); // 3 ways to print one by one 1.simple for loop 2.for each 3.iterator
		for(String e: obj) {
			System.out.println(e); // External iterator
		}
		//  or
		obj.forEach(temp -> System.out.println(temp)); // internal iteration
	}

}
