package com.cg.java8;

import java.util.Arrays;
import java.util.List;

public class Doubleit {
	public static void doubleit(int i) {
		System.out.println(i*2);
	}

	public static void main(String[] args) {
		List<Integer> List = Arrays.asList(1,2,3,4,5,6);
		List.forEach( i -> doubleit(i));
		List.forEach(Doubleit::doubleit);

	}

}