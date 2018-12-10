package Concept.Algorithm.DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySumTests {

    @Test
    public void basetest() {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = new MaximumSubarraySum().get(nums);
        System.out.println(result);
        assertEquals(7, result);
    }

    @Test
    public void basetest2() {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = new MaximumSubarraySum().getDP(nums);
        System.out.println(result);
        assertEquals(7, result);
    }
}
