package com.tns.Collection;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet linked=new LinkedHashSet();
		linked.add("Ravi");
		linked.add("A");
		linked.add("Aashu");
		linked.add(8);
		linked.add(90.0f);
		linked.add(null);
		linked.add(8);
		System.out.println("The data in the set: "+linked);
		

	}

}
