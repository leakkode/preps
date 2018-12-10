package Concept.Algorithm.DynamicProgramming;

import Concept.Algorithm.DynamicProgramming.FibonacciSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSequenceTests {

    @Test
    void baseCase() {

        int[] cache = new int[99];
        int result = FibonacciSequence.process(0, cache);
        assertEquals(0, result);

        result = FibonacciSequence.process(1, cache);
        assertEquals(1, result);

        result = FibonacciSequence.process(2, cache);
        assertEquals(1, result);

        result = FibonacciSequence.process(3, cache);
        assertEquals(2, result);

        result = FibonacciSequence.process(4, cache);
        assertEquals(3, result);

        result = FibonacciSequence.process(5, cache);
        assertEquals(5, result);

        result = FibonacciSequence.process(6, cache);
        assertEquals(8, result);

        result = FibonacciSequence.process(7, cache);
        assertEquals(13, result);
    }
}
