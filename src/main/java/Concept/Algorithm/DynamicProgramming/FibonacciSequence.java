package Concept.Algorithm.DynamicProgramming;

public class FibonacciSequence {

    public static int process(int N, int[] cache) {

        if (N<=0) {
            return 0;
        }

        if (N==1) {
            return 1;
        }

        if (cache[N]>0) {
            return cache[N];
        }

        cache[N] = process(N-1, cache) + process (N-2, cache);
        return cache[N];
    }
}
