package com.example.test;

public class Test {
	private String var1;
	private String var2;
	
	public Test() {}
	
	public Test(String var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
		System.out.println("variables var1 and var 2 successfully initiated.");
	}	
	
	public void display() {
		System.out.println("Running function \"display()\" as method of an object ...");
		System.out.printf("Displaying var1: %s, and var2: %s%n", this.var1, this.var2);
	}
	
		
	public static void main(String[] args) {
			Test obj1 = new Test("Sushinator", "Berthold Schtrolzenburger");
			obj1.display();
	}
}