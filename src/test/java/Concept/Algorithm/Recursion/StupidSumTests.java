package Concept.Algorithm.Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StupidSumTests {


    @Test
    void baseCase() {
        StupidSum ss = new StupidSum();
        assertEquals(1+2+3+4+5+6, ss.R(new int[]{1,2,3,4,5,6}, 0));
    }
}
