package Concept.Algorithm.DynamicProgramming;

import Concept.Algorithm.DynamicProgramming.Longest.LongestCommonSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTests {

    @Test
    public void basetest() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int lcs = new LongestCommonSubsequence().LCS(s1, s2, s1.length(), s2.length());

        assertEquals(3, lcs);
    }


    @Test
    public void basetest2() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i=0; i<dp.length; i++) {
            for (int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int lcs = new LongestCommonSubsequence().LCS_DP_recursive_memoization(s1, s2, s1.length(), s2.length(), dp);

        assertEquals(3, lcs);
    }

    @Test
    public void basetest3() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int lcs = new LongestCommonSubsequence().LCS_DP_tabulation(s1, s2);

        assertEquals(3, lcs);
    }

    @Test
    public void basetest4() {
        String s1 = "abdacp";
        String s2 = "ckamb";

        int lcs = new LongestCommonSubsequence().LCS_DP_tabulation(s1, s2);

        assertEquals(2, lcs);
    }

}
