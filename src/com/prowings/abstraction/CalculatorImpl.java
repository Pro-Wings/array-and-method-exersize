package com.prowings.abstraction;

public class CalculatorImpl implements Calculator{

	
	public int addition(int n1, int n2) {
		return n1 + n2;
	}

	public int substraction(int n1, int n2) {
		return n1 - n2;
	}

	public int division(int n1, int n2) {
		return n1 / n2;
	}

	public int multiplication(int n1, int n2) {
		return n1 * n2;
	}

	
}
