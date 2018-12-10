package Concept.Algorithm.Recursion;

public class FibonacciSequence {

    public static int process(int N) {

        if (N<=0) {
            return 0;
        }

        if (N==1) {
            return 1;
        }

        return process(N-1) + process (N-2);
    }
}
