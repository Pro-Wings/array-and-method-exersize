package com.prowings.abstraction;

public abstract class Parent {
	
	int age;
	String name;
	
	public Parent(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
		System.out.println("in parents all arg constructor!!!");
	}

	public Parent()
	{
		super();
		System.out.println("in parent class no arg constructor!!!");

	}
	
	
	public abstract void printHello();

	public void printHiii() {
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
	}
}
