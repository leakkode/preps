package Concept.Algorithm.DynamicProgramming;

public class MinStepToOne {



    public int minstep_recursive(int N) {
        if (N==1) {
            return 0;
        }

        return 1 + Math.min(minstep_recursive(N-1), Math.min(N % 2 == 0 ? minstep_recursive(N/2) : 99, N % 3 == 0 ? minstep_recursive(N/3) : 99));
    }

    public int minstep_recursive2(int N) {
        if (N==1) {
            return 0;
        }

        int value = 1 + minstep_recursive2(N-1);
        if (N % 2 == 0) {
            value = Math.min(value, 1 + minstep_recursive2(N/2));
        }

        if (N % 3 == 0) {
            value = Math.min(value, 1 + minstep_recursive2(N/3));
        }

        return value;
    }

    public int minstep_recursive2_dp_memo(int N, int[] memo) {
        if (N==1) {
            return 0;
        }

        if (memo[N] > -1) {
            return memo[N];
        }

        int value = 1 + minstep_recursive2(N-1);
        if (N % 2 == 0) {
            value = Math.min(value, 1 + minstep_recursive2(N/2));
        }

        if (N % 3 == 0) {
            value = Math.min(value, 1 + minstep_recursive2(N/3));
        }
        memo[N] = value;
        return memo[N];

    }

    public int minstep_recursive2_dp_table(int N) {
        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i<=N; i++) {
            dp[i] = 1 + dp[i-1];
            if (i % 2 == 0) dp[i] = 1 + dp[i/2];
            if (i % 3 == 0) dp[i] = 1 + dp[i/3];
        }

        return dp[N];
    }
}
