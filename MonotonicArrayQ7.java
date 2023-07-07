package in.ineuron.assignment2;

public class MonotonicArrayQ7 {
	public boolean isMonotonic(int[] nums) {
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				increasing = false;
			}

			if (nums[i] > nums[i - 1]) {
				decreasing = false;
			}
		}

		return increasing || decreasing;
	}

	public static void main(String[] args) {
		// Question 7
		int[] nums = { 1, 2, 2, 3 };

		MonotonicArrayQ7 solution = new MonotonicArrayQ7();
		boolean isMonotonic = solution.isMonotonic(nums);

		System.out.println("Output is : " + isMonotonic);
	}

}
