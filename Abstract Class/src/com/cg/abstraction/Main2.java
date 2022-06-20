package com.cg.abstraction;
 abstract class dress
{
	abstract void type();
}
class menswear extends dress
{
	void type()
	{
		System.out.print("It's a Men's wear");
	}
}
public class Main2{
	public static void main(String args[])
	{
		menswear coat = new menswear();
		coat.type();
	}
}
