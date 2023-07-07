package in.ineuron.assignment2;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequenceQ3 {
	public int findLHS(int[] nums) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int longestSubsequence = 0;

		for (int num : frequencyMap.keySet()) {
			if (frequencyMap.containsKey(num + 1)) {
				int currentSubsequence = frequencyMap.get(num) + frequencyMap.get(num + 1);
				longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
			}
		}

		return longestSubsequence;
	}

	public static void main(String[] args) {
		// Question 3
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };

		LongestHarmoniousSubsequenceQ3 solution = new LongestHarmoniousSubsequenceQ3();
		int longestSubsequenceLength = solution.findLHS(nums);

		System.out.println("Output: " + longestSubsequenceLength);
	}

}
