package com.prowings.array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElementsFromArray3 {

	public static void main(String[] args) {

		Integer[] nums = { 5, 2, 5, 3};

		System.out.println("Original Array : " + Arrays.toString(nums));

		Integer[] uniqElements = removeDuplicates(nums);

		System.out.println("Unique Elements : " + Arrays.toString(uniqElements));

	}

	public static Integer[] removeDuplicates(Integer[] nums) {
		HashSet<Integer> uniqElementsSet = new HashSet<Integer>(Arrays.asList(nums));
		return uniqElementsSet.toArray(new Integer[uniqElementsSet.size()]);
	}

}
