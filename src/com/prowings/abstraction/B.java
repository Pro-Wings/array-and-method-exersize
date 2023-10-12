package com.prowings.abstraction;

public class B extends A{
	
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.printHello();
		b.printHi();
		b.addition(10, 30);
	}

	@Override
	public void printHi() {
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");		
	}

	@Override
	public void addition(int number1, int number2) {
		
		int res = number1 + number2;
		
		System.out.println("Addition is : "+ res);
		
	}


}
