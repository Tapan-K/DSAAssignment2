package in.ineuron.assignment2;

import java.util.Arrays;

public class MaxProductQ5 {
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Maximum product can be the product of the three largest elements
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Maximum product can also be the product of the two smallest elements if they are negative, and the largest element
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(product1, product2);
    }

	public static void main(String[] args) {
		// question 5
		int[] nums = {1, 2, 3};

		MaxProductQ5 solution = new MaxProductQ5();
        int maxProduct = solution.maximumProduct(nums);

        System.out.println("Output: " + maxProduct);

	}

}
