package com.prowings.abstraction;

public class TestCalculatorImpl {
	
	public static void main(String[] args) {
		
		CalculatorImpl obj = new CalculatorImpl();
		
		System.out.println("Addition is : "+ obj.addition(10, 20));
		System.out.println("Substraction is : "+ obj.substraction(10, 20));
		System.out.println("Multiplication is : "+ obj.multiplication(10, 20));
		System.out.println("Division is : "+ obj.division(10, 20));
		
	}

}
