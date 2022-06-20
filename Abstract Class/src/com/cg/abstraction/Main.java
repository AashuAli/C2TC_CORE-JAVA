package com.cg.abstraction;

abstract class Lion {
	  public abstract void sound();
		  
	  
	}
	public class Main extends Lion
	{
		public void sound()
		{
			System.out.println("Roar");
		}
		public static void main(String args[])
		{
			
				Lion obj = new Main();
				obj.sound();
			}
		}