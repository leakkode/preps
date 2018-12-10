package Concept.Algorithm.Recursion;

public class TowerOfHanoi {

    public void move(int n, char from, char to, char temp) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        move(n-1, from, temp, to);
        System.out.println("Move disk " + n + " from "  + from  + " to " + to);
        move(n-1, temp, to, from);
    }
}
