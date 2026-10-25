
import java.util.Arrays;

public class HouseRobber {

    static int maxLoot(int[] arr, int idx, int[] dp) {

        // Base case: No houses left
        if (idx >= arr.length) {
            return 0;
        }

        // If answer is already calculated
        if (dp[idx] != -1) {
            return dp[idx];
        }

        // Option 1: Steal from current house
        int steal = arr[idx] + maxLoot(arr, idx + 2, dp);

        // Option 2: Skip current house
        int skip = maxLoot(arr, idx + 1, dp);

        // Store the maximum answer
        dp[idx] = Math.max(steal, skip);

        return dp[idx];
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 11, 2};

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        int result = maxLoot(arr, 0, dp);

        System.out.println("Maximum loot: " + result);
    }
}
