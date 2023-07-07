package in.ineuron.assignment2;

import java.util.Arrays;

public class ArraySumPairQ1 {
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// Question 1
		int[] nums = {1, 4, 3, 2};

		ArraySumPairQ1 solution = new ArraySumPairQ1();
        int maxSum = solution.arrayPairSum(nums);

        System.out.println("Output: " + maxSum);

	}

}
