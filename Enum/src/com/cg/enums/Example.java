package com.cg.enums;
import com.cg.enums.ExampleEnum.Season;
public class Example {
public enum Season{
	WINTER(10),SPRING(5),SUMMER(15),AUTUMN(20);
	int value;
	Season(int value){
		this.value=value;
	}
}
public static void main(String[]args) {
	for(Season s:Season.values()) {
		System.out.println(s+ " " +s.value);
	}
}
}
