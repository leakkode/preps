package LeekCode.Proposed;

import java.util.ArrayList;
import java.util.List;

public class AllTheDupes {
    public List<Integer> allthedupes(int[] nums) {
        int[] table = new int[2^12];
        for (int i=0; i<nums.length; i++) {
            table[nums[i]]++;
        }

        List<Integer> result = new ArrayList();
        for (int i=0; i<table.length;i++) {
            if(table[i]>1) {
                result.add(i);
            }
        }

        return result;
    }
}
