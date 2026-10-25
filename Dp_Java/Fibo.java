
class Fibo {

    static int fibo(int n, int[] dp) {

        // Base case
        if (n <= 1) {
            return n;
        }

        // If answer is already calculated
        if (dp[n] != -1) {
            return dp[n];
        }

        // Calculate and store the answer
        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);

        return dp[n];
    }

    public static void main(String args[]) {

        int n = 5;

        int dp[] = new int[n + 1];

        // Initialize DP array
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        int result = fibo(n, dp);

        System.out.println("Fibonacci number: " + result);
    }
}
