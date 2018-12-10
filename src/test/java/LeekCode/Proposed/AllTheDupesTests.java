package LeekCode.Proposed;

import org.junit.jupiter.api.Test;

import java.util.List;

public class AllTheDupesTests {
//    Input: nums = []
//    Output: []
//    Input: nums = [1]
//    Output: []
//    Input: nums = [1, 0, 1];
//    Output: [1];
//    Input: nums= [1,1,1,1,2,3,4,4,4,6,5,4,3,10];
//    Output: [1,3,4];
    @Test
    public void basecase() {

            List<Integer> result = new AllTheDupes().allthedupes(new int[]{1,1,1,1,2,3,4,4,4,6,5,4,3,10});
        for (int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
