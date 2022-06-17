package com.tns.Collection;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		LinkedHashSet <String> linked = new LinkedHashSet<>();
		linked.add("Rahul");
		linked.add("pass");
		linked.add("blood group");
		linked.add("O+");
		System.out.println(linked);
		Object[] a=linked.toArray();
		for(int i=0; i<a.length;i++) {//to print the names in new lines
			System.out.println(a[i]);
		}

	}

}
