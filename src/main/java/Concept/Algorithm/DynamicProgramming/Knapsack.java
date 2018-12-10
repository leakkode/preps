package Concept.Algorithm.DynamicProgramming;

public class Knapsack {

    private void debug(int[][] dp) {
        for (int i=0; i<dp.length; i++) {
            for (int j=0; j<dp[i].length; j++) {
                System.out.print("[" + dp[i][j] + "]");
            }
            System.out.println();
        }
    }
    public void process(int[] weights, int[] values, int max_weight) {

        int[][] dp = new int[weights.length + 1][max_weight + 1];

        for (int w=1; w<=weights.length; w++) {

            // for clarity purposes
            int current_weight = weights[w-1];
            int current_value = values[w-1];

            for (int i=0; i<=max_weight; i++) {
                // you don't need these because they are 0 anyway.
//                if (i==0 || w == 0) {
//                    dp[w][i] = 0;
//                } else
                if (i < current_weight) {
                    dp[w][i] = dp[w-1][i];
                } else {
                    int lastIndex = Math.max(i-current_weight, 0);
                    // dp[w-1] because you cannot select the same w twice
                    dp[w][i] = Math.max(dp[w-1][i], current_value + dp[w-1][lastIndex]);
                }
            }
        }

        debug(dp);
    }
}
