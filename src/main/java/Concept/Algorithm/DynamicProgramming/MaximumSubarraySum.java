package Concept.Algorithm.DynamicProgramming;

public class MaximumSubarraySum {

    // this is also known as Kadane's algorithm
    public int get(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int curr_max = 0;
        for (int i=0; i<nums.length; i++) {
            curr_max += nums[i];
            max_so_far = Math.max(curr_max, max_so_far);
            curr_max = Math.max(0, curr_max);
        }

        return max_so_far;
    }

    public int getDP(int[] nums) {
        int max_so_far = nums[0];
        int curr_max = nums[0];
        for (int i=1; i<nums.length; i++) {
            //
            curr_max = Math.max(nums[i], curr_max+nums[i]);
            max_so_far = Math.max(curr_max, max_so_far);
            System.out.format("nums[i]: %d, curr_max: %d, msf: %d\n", nums[i], curr_max, max_so_far);
        }

        return max_so_far;
    }
}
