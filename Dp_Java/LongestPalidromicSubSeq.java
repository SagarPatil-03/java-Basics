
public class LongestPalidromicSubSeq {

    public static void main(String args[]) {

        String s1 = "bbbab";

        String s2 = new StringBuilder(s1).reverse().toString();

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                } else {

                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        System.out.println("Original String: " + s1);
        System.out.println("Reverse String: " + s2);
        System.out.println("LPS Length: " + dp[n][m]);
    }
}
