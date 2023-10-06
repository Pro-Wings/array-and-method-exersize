package com.prowings.array;

public class ForLoopOnArray {

	public static void main(String[] args) {

		int[] numbers = new int[3];

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
//		numbers[3] = 40;
//		numbers[4] = 50;

		System.out.println("numbers[] lenght : " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>");
		// for-each or enhanced for loop

		for (int n : numbers) {
			System.out.println(n);
		}

	}

}
