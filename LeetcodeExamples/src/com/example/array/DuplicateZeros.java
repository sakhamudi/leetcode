package com.example.array;

public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1,0,2,3,0,4,5,0};
		duplicateZeros(input);

	}

	public static void duplicateZeros(int[] arr) {

		int index = 0;
		boolean flag = true;
		for (int value : arr) {
			if (value == 0 && flag) {
				shiftData(arr, index);
				flag =  false;
				index++;
				continue;
			}
			index++;
			flag = true;
		}

		System.out.println("Result ::");
		for (int value : arr) {
			System.out.println(value);
		}
	}

	private static void shiftData(int[] arr, int index) {
		// TODO Auto-generated method stub

		// {1,0,2,3,0,4,5};
		// index = 1
		// i = 7
		for (int i = arr.length - 1; i > index;) {
			arr[i] = arr[--i];
		}
		arr[index] = 0;
	}
}
