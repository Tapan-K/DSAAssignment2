package in.ineuron.assignment2;
import java.util.HashSet;
import java.util.Set;

public class MaxCandiesQ2 {
	public int maxDifferentCandies(int[] candyType) {
        int n = candyType.length;
        int maxEat = n / 2; // Maximum number of candies Alice can eat

        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // Return the minimum of unique candies and maxEat
        return Math.min(uniqueCandies.size(), maxEat);
    }

	public static void main(String[] args) {
		// Question 2
		int[] candyType = {1, 1, 2, 2, 3, 3};

		MaxCandiesQ2 solution = new MaxCandiesQ2();
        int maxDifferentTypes = solution.maxDifferentCandies(candyType);

        System.out.println("Output: " + maxDifferentTypes);

	}

}
