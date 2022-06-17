package com.cg.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterClass {
	public static void main(String[]args) {
		LocalDateTime myDateObj=LocalDateTime.now();
		System.out.println("Before formating what is your date " +myDateObj);
		System.out.println(myDateObj);
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");
		String formattedDate=myDateObj.format(myFormatObj);
		System.out.println("After formating what is your date?" +formattedDate);
		
}
}
