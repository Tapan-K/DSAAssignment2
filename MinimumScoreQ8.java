package in.ineuron.assignment2;

import java.util.Arrays;

public class MinimumScoreQ8 {
	public int minScore(int[] nums, int k) {
		int n = nums.length;

		Arrays.sort(nums);

		// Initialize the minimum and maximum elements
		int min = nums[0];
		int max = nums[n - 1];

		if (k >= max - min) {
			return 0;
		}

		// Apply the operation to the minimum and maximum elements
		min += k;
		max -= k;

		// Update the minimum and maximum elements after the operation
		min = Math.min(min, nums[0] + k);
		max = Math.max(max, nums[n - 1] - k);

		return max - min;
	}

	public static void main(String[] args) {
		// Question 8
		int[] nums = { 1 };
		int k = 0;

		MinimumScoreQ8 solution = new MinimumScoreQ8();
		int minScore = solution.minScore(nums, k);

		System.out.println("Output is -->: " + minScore);

	}

}
