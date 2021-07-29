package com.example.array;


public class MergeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		
		merge(nums1,m,nums2,n);
		disply(nums1);
		sort(nums1);
		disply(nums1);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for(int i=m, j=0;i<(m+n);i++,j++) {
			nums1[i]=nums2[j];
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


	public static void disply(int[] nums1){
		
		for(int num:nums1) {
			System.out.print(num +" ");
		}
		System.out.println(" ");
	}
}
