package Concept.Algorithm.DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpingOverSpikesTests {

    @Test
    public void baseCase() {

        boolean[] spikes = new boolean[]{false, false, false, false, false, true, true, true};
        assertFalse(new JumpingOverSpikes().jump(0, 2, spikes));

        spikes = new boolean[]{false, true, false, false, false, true, true, true};
        assertFalse(new JumpingOverSpikes().jump(0, 2, spikes));

        spikes = new boolean[]{false, false, false, true, false, true, true, true};
        assertTrue(new JumpingOverSpikes().jump(0, 2, spikes));

    }

    @Test
    public void baseCase2() {
        boolean[] spikes = new boolean[]{false, false, true, false, false, false, false, false};

        int[][] cache = new int[spikes.length][10];
        for (int i =0; i<cache.length; i++) for (int j=0; j<cache[0].length; j++) cache[i][j] = -1;
        assertFalse(new JumpingOverSpikes().jump_memo(0, 2, spikes, cache));

//        spikes = new boolean[]{false, true, false, false, false, true, true, true};
//        assertFalse(new JumpingOverSpikes().jump(0, 2, spikes));
//
//        spikes = new boolean[]{false, false, false, true, false, true, true, true};
//        assertTrue(new JumpingOverSpikes().jump(0, 2, spikes));

    }
}
