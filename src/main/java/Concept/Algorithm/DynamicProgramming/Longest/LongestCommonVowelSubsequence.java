package Concept.Algorithm.DynamicProgramming.Longest;

public class LongestCommonVowelSubsequence {


    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int LCVS_tabulation(String M, String N) {
        if (M.length() == 0 || N.length() == 0) {
            return 0;
        }

        int[][] dp = new int[M.length() + 1][N.length() + 1];

        for (int m=0; m<M.length(); m++) {
            for (int n=0; n<N.length(); n++) {

                if (m==0 || n==0) {
                    // setup the padding
                    dp[m][n] = 0;
                } else if (M.charAt(m-1) == N.charAt(n-1) && isVowel(M.charAt(m-1))) {
                    // when they match, add score
                    dp[m][n] = 1 + dp[m-1][n-1];
                } else {
                    // otherwise, pick best options.
                    dp[m][n] = Math.max(dp[m-1][n], dp[m][n-1]);
                }
            }
        }

        return dp[M.length() - 1][N.length() - 1];
    }
}
