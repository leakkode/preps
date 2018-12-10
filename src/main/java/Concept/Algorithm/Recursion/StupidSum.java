package Concept.Algorithm.Recursion;

public class StupidSum {

    public int R(int[] arr, int i) {
        if (i>=arr.length) {
            return 0;
        }
        return arr[i] + R(arr, i+1);
    }
}
