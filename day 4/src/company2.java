class Company2 {
	String name;
	public static void main(String[] args) {
		Company2 c = new Company2();
		Company2 c1 =c;
		c1.name ="C2TC";
		c= null;
		System.out.println(c.name);
		
	}

}