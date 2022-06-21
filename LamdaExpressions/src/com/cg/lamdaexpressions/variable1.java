package com.cg.lamdaexpressions;

interface addition{
	public int add(int a,int b);
	
}
public class variable1 {

	public static void main(String[] args) {
		addition d2=(int a,int b)-> (a+b); {
			System.out.println(d2.add(10,20));};
		}

	}
// or

/*interface addition1 {
	public int add();
}

public class variable2 {
	public static void main(String[]args) {
		addition d3=()-> (10+20); {
			System.out.println(d3.add()); };
		}
	}
	
}
*/