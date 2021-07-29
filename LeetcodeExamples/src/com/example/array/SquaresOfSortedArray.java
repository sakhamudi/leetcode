package com.example.array;

import java.util.stream.Stream;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		// Auto-generated method stub

		int[] nums = { -1, 9, 6, 4 - 2, };

		int[] seq = getSquersArray(nums);

		for (int num : seq) {
			System.out.println(num);
		}
		sort(seq);
		System.out.println("------------------");
		for (int num : seq) {
			System.out.println(num);
		}
	}

	private static void sort(int[] seq) {
		// TODO Auto-generated method stub
		for (int i = 0; i < seq.length; i++) {

			for (int j = i; j < seq.length; j++) {

				if (seq[i] > seq[j]) {
                   int temp = seq[i];
                   seq[i] = seq[j];
                   seq[j] = temp;
				}
			}
		}
	}

	private static int[] getSquersArray(int[] nums) {
		// Auto-generated method stub
		// int[] seqNums;
		int[] seqNums = new int[nums.length];
		int i = 0;
		for (int num : nums) {
			seqNums[i] = num * num;
			i++;
		}
		return seqNums;
	}

}
