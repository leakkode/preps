package LeekCode.Medium;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptimalDivision {

    public void optimalDivision(int[] nums) {

        StringBuilder sb = new StringBuilder().append(IntStream.of(nums).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining("/")));
        sb.insert(sb.indexOf("/") +1, "(").append(")");
    }
}
