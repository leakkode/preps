package LeekCode.Medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneGameTests {


    public static void printMatrix(int[][] dp) {
        for(int r=0; r<dp.length; r++) {
            for (int c=0; c<dp.length; c++) {
                System.out.print("["+dp[r][c]+"]");
            }
            System.out.println();
        }
    }
    public static boolean stoneGame(int[] p) {
        int n = p.length;
        int[][] dp  = new int[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = p[i];
        for (int d = 1; d < n; d++)
            for (int i = 0; i < n - d; i++)
                dp[i][i + d] = Math.max(p[i] - dp[i + 1][i + d], p[i + d] - dp[i][i + d - 1]);

        StoneGameTests.printMatrix(dp);
        return dp[0][n - 1] > 0;
    }

    @Test
    public void baseCase() {
        int score = new StoneGame().getAlexScore(new int[] {7,6,4,5}, 0, 4 -1, 0, 0, true);
        assertEquals(13, score);

        score = new StoneGame().getAlexScore(new int[] {5,6,4,5}, 0, 4 -1, 0, 0, true);
        assertEquals(11, score);

        score = new StoneGame().getAlexScore(new int[] {7,6}, 0, 2 -1,  0, 0, true);
        assertEquals(7, score);

    }

    @Test
    public void baseCase2() {
      assertTrue(new StoneGame().WillAlexWin(new int[] {7,6,4,5}, 0, 4 -1, 0, 0, true));

      assertTrue(new StoneGame().WillAlexWin(new int[] {5,6,4,5}, 0, 4 -1, 0, 0, true));

      assertTrue(new StoneGame().WillAlexWin(new int[] {7,6}, 0, 2 -1, 0, 0, true));
    }

    @Test
    public void baseCase3() {
//        assertTrue(new StoneGame().WillAlexWin(new int[] {3,2,10,4}, 0, 4 -1, true, 0, 0));
        assertTrue(new StoneGame().WillAlexWin(new int[] {3,2,10,4}, true, 0, true, 0, 0));
    }

    @Test
    public void solution() {
        StoneGameTests.stoneGame(new int[] {3,2,10,4});
    }
}
