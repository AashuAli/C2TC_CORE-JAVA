package com.cg.lamdaexpressions;
interface Drawable {
	void draw(int radius);
}
public class variable {

	public static void main(String[] args) {
		Drawable d2=(int radius)->{
			System.out.println("Draw the circle with radius of |" +radius);
			
		};
		d2.draw(10);

	}

}
