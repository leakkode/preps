package Concept.Algorithm.DynamicProgramming;

import org.junit.jupiter.api.Test;

public class MinStepToOneTests {

    @Test
    public void baseTest() {
        System.out.println(new MinStepToOne().minstep_recursive(4));
    }

    @Test
    public void baseTest2() {
        System.out.println(new MinStepToOne().minstep_recursive2(7));
    }

    @Test
    public void baseTest3() {
        int N = 7;
        int[] memo = new int[N + 1];
        for (int i=0; i<memo.length; i++) memo[i] = -1;
        System.out.println(new MinStepToOne().minstep_recursive2_dp_memo(N, memo));
    }

    @Test
    public void baseTest4() {
        for (int N=2; N<8; N++)
        System.out.format("%d ,%d\n", N, new MinStepToOne().minstep_recursive2_dp_table(N));
    }
}
