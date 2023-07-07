package in.ineuron.assignment2;

public class CanPlaceFlowersQ4 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and its adjacent plots are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                count++; 
                
                // If the required number of flowers are planted, return true
                if (count >= n) {
                    return true;
                }
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		// question 4
		int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        CanPlaceFlowersQ4 solution = new CanPlaceFlowersQ4();
        boolean canPlace = solution.canPlaceFlowers(flowerbed, n);

        System.out.println("Output: " + canPlace);
	}

}
