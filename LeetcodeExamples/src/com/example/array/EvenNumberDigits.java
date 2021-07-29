package com.example.array;

public class EvenNumberDigits {

	public static void main(String[] args) {
		// Auto-generated method stub

		int[] nums = { 1, 23, 444, 55555, 666, 66,99 };

		int count = findNumbers(nums);
		
		System.out.println("Count :: "+count);
	}

	public static int findNumbers(int[] nums) {

		int count = 0;
		
		for (int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}

	public static boolean even(int num) {

		if (String.valueOf(num).length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
