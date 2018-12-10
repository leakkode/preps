package Concept.Operation;

import org.junit.jupiter.api.Test;

public class BitTest {

    @Test
    void baseCase() {

        int score = 0;

        int[] bits = new int[]{0, 0, 1, 1}; // 3

        for (int i=0; i<bits.length; i++) {
            score = (score << 1| bits[i]);

        }

        System.out.format("Score: %d\n", score);

    }
}
