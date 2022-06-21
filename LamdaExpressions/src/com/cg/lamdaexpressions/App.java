package com.cg.lamdaexpressions;

/*class App_one{
	void display() {
		System.out.println("i am from display method");
	}
}*/
interface Lamda{
	void display(); // abstract method with no parameter
}

public class App {

	public static void main(String[] args) {
	/*	App_one obj=new App_one();
		obj.display(); */
		Lamda obj = ()->  System.out.println("i am from display method");
		obj.display();

	}

}
