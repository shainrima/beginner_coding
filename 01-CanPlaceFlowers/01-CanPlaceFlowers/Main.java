import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the flowerbed
        int m = scanner.nextInt();

        // Initialize the flowerbed array with size m
        int[] flowerbed = new int[m];

        // Read the flowerbed elements (0 or 1)
        for (int i = 0; i < m; i++) {
            flowerbed[i] = scanner.nextInt();
        }

        // Read the number of flowers to plant
        int n = scanner.nextInt();

        // Call the method to check if planting is possible and print result
        System.out.println(canPlaceFlowers(flowerbed, n));

        scanner.close();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // count of flowers planted

        // Loop through each plot in the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if current plot is empty
            if (flowerbed[i] == 0) {
                // Check if left neighbor is empty or this is the first plot
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                // Check if right neighbor is empty or this is the last plot
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both neighbors are empty, we can plant a flower here
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // plant flower
                    count++;          // increment planted count
                    if (count >= n) {
                        return true;  // planted enough flowers
                    }
                }
            }
        }

        // After checking all plots, return whether enough flowers were planted
        return count >= n;
    }
}
