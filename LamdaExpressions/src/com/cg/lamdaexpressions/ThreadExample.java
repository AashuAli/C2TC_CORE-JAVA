package com.cg.lamdaexpressions;

interface Lambda{
	void display();
}
public class ThreadExample {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("This is one Thread");}).start();

	}

}
