package LeekCode.Medium;

import org.junit.jupiter.api.Test;

public class MinimumIncrementToMakeArrayUniqueTests {

    @Test
    public void baseCase() {
        int[] request = {2,1,2,1,7, 1, 1, 1, 1};
        new MinimumIncrementToMakeArrayUnique().go(request);
    }
}
