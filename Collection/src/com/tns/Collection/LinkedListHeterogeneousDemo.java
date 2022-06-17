package com.tns.Collection;
import java.util.*;
public class LinkedListHeterogeneousDemo {

	public static void main(String[] args) {
		List list=new LinkedList();
		list.add("Ravi");
		list.add("6");
		list.add("Aashu");
		list.add("56.7f");
		list.add("null");
		list.add("6");
		System.out.println(((LinkedList) list).offer("Ali"));
		System.out.println(list);

	}

}
