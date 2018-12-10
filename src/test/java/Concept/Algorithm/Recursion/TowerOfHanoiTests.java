package Concept.Algorithm.Recursion;

import org.junit.jupiter.api.Test;

public class TowerOfHanoiTests {

    @Test
    public void baseCase() {
        new TowerOfHanoi().move(3, 'A', 'C', 'B');
    }
}
