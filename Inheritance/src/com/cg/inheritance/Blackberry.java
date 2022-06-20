package com.cg.inheritance;

public class Blackberry extends Mobile {

	public Blackberry(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);//constructor method signature
	}
	// TODO Auto-generated constructor stub
		public String getModel() {
			return "This is superclass method: "+this.model;
		}
	}
	
		
		

