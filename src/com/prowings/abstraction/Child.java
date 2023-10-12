package com.prowings.abstraction;

public class Child extends Parent{

	public Child()
	{
		super();
		System.out.println("in child class no arg constructor!!!");
	}

	public Child(int age, String name)
	{
		super(age, name); //constructor chaining!!
		System.out.println("in child class arg constructor!!!");
	}
	
	@Override
	public void printHello() {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println(c.age);
		System.out.println(c.name);
		
		c.printHiii();
		c.printHello();
		
//		Parent p = new Parent(10, "Ram"); //this is invalid as we can not instantiate abstract class
		
		Child c2 = new Child(10, "Ram");

		System.out.println(c2.age);
		System.out.println(c2.name);

		
		c2.printHiii();
		c2.printHello();
		
	}

}
