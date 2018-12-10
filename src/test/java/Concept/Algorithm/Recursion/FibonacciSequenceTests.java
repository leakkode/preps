package Concept.Algorithm.Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSequenceTests {

    @Test
    void baseCase() {


        int result = FibonacciSequence.process(0);
        assertEquals(0, result);

        result = FibonacciSequence.process(1);
        assertEquals(1, result);

        result = FibonacciSequence.process(2);
        assertEquals(1, result);

        result = FibonacciSequence.process(3);
        assertEquals(2, result);

        result = FibonacciSequence.process(4);
        assertEquals(3, result);

        result = FibonacciSequence.process(5);
        assertEquals(5, result);

        result = FibonacciSequence.process(6);
        assertEquals(8, result);

        result = FibonacciSequence.process(7);
        assertEquals(13, result);
    }
}
