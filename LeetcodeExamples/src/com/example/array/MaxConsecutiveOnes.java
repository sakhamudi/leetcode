package com.example.array;

//Max Consecutive Ones

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = 
				{ 1,1,1,1,1, 1,1,0, 1,1,1,0,1,1,1,1,1,1,1,1};
		

		int oldNoOfConsecuencive = findMaxConsecutiveOnes(nums);
		System.out.println("oldNoOfConsecuencive::" + oldNoOfConsecuencive);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
	
		 int count = 0; //intitialize count
	        int result = 0; //initialize max

		for (int num : nums) {

			if (num != 1) {
				  count = 0;
			} else  {
				count++;//increase count
                result = Math.max(result, count);
			}
		}
		return result;
	}

}
