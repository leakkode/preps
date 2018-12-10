package Concept.Algorithm.DynamicProgramming;

import org.junit.jupiter.api.Test;

public class KnapsackTests {

    @Test
    public void baseTest() {
        new Knapsack().process(new int[]{1,3,4,5}, new int[]{1,4,5,7}, 7);

    }
}
