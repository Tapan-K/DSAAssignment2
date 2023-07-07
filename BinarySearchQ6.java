package in.ineuron.assignment2;

public class BinarySearchQ6 {

	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// Question 6
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;

		BinarySearchQ6 solution = new BinarySearchQ6();
		int index = solution.search(nums, target);

		System.out.println("Output: " + index);

	}

}
