package LeekCode.Medium;

import org.junit.jupiter.api.Test;

public class QueueReconstructionByHeightTests {
    @Test
    public void baseTest() {
        int[][] people = new int[6][2];
        people[0] = new int[]{7,0};
        people[1] = new int[]{4,4};
        people[2] = new int[]{7,1};
        people[3] = new int[]{5,0};
        people[4] = new int[]{6,1};
        people[5] = new int[]{5,2};

        new QueueReconstructionByHeight().reconstructQueue(people);
    }
}
