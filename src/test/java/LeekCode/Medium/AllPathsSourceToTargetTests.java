package LeekCode.Medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceToTargetTests {
    @Test
    void baseCase1() {
        List<int[]> input = new ArrayList<int[]>();
        input.add(new int[]{1});
        input.add(new int[]{2,3});
        input.add(new int[]{});
        input.add(new int[]{});
        AllPathsSourceToTarget.work(input);
    }

    @Test
    void baseCase2() {
        List<int[]> input = new ArrayList<int[]>();
        input.add(new int[]{1});
        input.add(new int[]{2,3});
        input.add(new int[]{4,5});
        input.add(new int[]{4,5});
        input.add(new int[]{});
        input.add(new int[]{});
        AllPathsSourceToTarget.work(input);
    }
}
