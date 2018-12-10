package Concept.Algorithm.DynamicProgramming.Longest;

public class LongestCommonSubsequence {

    public int LCS(String M, String N, int m, int n) {
        if (m == 0 || n == 0 ) {
            return 0;
        }

        if (M.charAt(m-1) == N.charAt(n-1)) {
            return 1 + LCS(M, N, m-1, n-1);
        } else {
            return Math.max( LCS(M, N, m-1, n),  LCS(M, N, m, n-1));
        }
    }


    public int LCS_DP_recursive_memoization(String M, String N, int m, int n, int[][] dp) {
        if (m == 0 || n == 0 ) {
            return 0;
        }

        if (dp[m][n]>-1) {
            return dp[m][n];
        }

        if (M.charAt(m-1) == N.charAt(n-1)) {
            dp[m][n] = 1 + LCS(M, N, m-1, n-1);
        } else {
            dp[m][n] = Math.max( LCS(M, N, m-1, n),  LCS(M, N, m, n-1));
        }

        return dp[m][n];
    }

    public int LCS_DP_tabulation(String M, String N) {
        int[][] dp = new int[M.length() + 1][N.length() + 1];

        for (int m=0 ;m<=M.length(); m++) {
            for (int n=0; n<=N.length(); n++) {
                if (m==0 || n==0) {
                    dp[m][n] = 0;
                } else if (M.charAt(m-1) == N.charAt(n-1)) {
                    dp[m][n] = 1 + dp[m-1][n-1];
                } else {
                    dp[m][n] = Math.max(dp[m-1][n], dp[m][n-1]);
                }

            }
        }

        return dp[M.length()][N.length()];
    }
}
