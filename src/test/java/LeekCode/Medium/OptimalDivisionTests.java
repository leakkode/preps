package LeekCode.Medium;

import org.junit.jupiter.api.Test;

public class OptimalDivisionTests {

    @Test
    public void basecase() {
        int[] nums = new int[]{1000,100,10,2};
        new OptimalDivision().optimalDivision(nums);
    }
}
