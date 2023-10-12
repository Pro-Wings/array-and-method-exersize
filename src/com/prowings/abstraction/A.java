package com.prowings.abstraction;

public abstract class A {
	
	
	public void printHello() //concrete method - having body
	{
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
	}
	

	public abstract void printHi(); //abstract method - without body

	public abstract void addition(int number1, int number2); //abstract method - without body
	
}
