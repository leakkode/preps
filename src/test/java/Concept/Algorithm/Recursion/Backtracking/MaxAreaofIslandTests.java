package Concept.Algorithm.Recursion.Backtracking;

import org.junit.jupiter.api.Test;

public class MaxAreaofIslandTests {

    @Test
    public void basecase() {

        System.out.println( 9 & -9);
        System.exit(0);

        int[][] grid = {{0,1,0},{1,1,1}};
        new MaxAreaofIsland().go(grid);
    }
}
