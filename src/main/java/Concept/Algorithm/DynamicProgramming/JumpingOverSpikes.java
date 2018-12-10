package Concept.Algorithm.DynamicProgramming;

public class JumpingOverSpikes {

    // true means you have a hit, false means you are safe.
    public boolean jump(int n, int speed, boolean[] spikes) {
        if (n >= spikes.length || speed <= 0) {
            return spikes[n];
        }

        boolean hit = spikes[speed + n];
        if (hit) {
            return true;
        } else {
            return jump(speed + n, speed, spikes) ||
                    jump(speed - 1 + n, speed - 1, spikes) ||
                    jump(speed + 1 + n, speed + 1, spikes);
        }
    }

    // dp section
    // return false if coast is clear;
    public boolean jump_memo(int n, int speed, boolean[] spikes, int[][] memo) {
        if (n >= spikes.length || speed <= 0) {
            return spikes[spikes.length - 1];
        }
        if (memo[n][speed]!=-1) return memo[n][speed] == 1;
        boolean hit = spikes[n];
        if (hit) {
            return true;
        } else {
            memo[n][speed] = jump_memo(speed + n, speed, spikes, memo) ? 1 : 0;
            memo[n][speed-1] =  jump_memo(speed - 1 + n, speed - 1, spikes, memo) ? 1 : 0;
            memo[n][speed+1] = jump_memo(speed + 1 + n, speed + 1, spikes, memo) ? 1 : 0;
            return memo[n][speed] == 1 && memo[n][speed-1] == 1 && memo[n][speed+1] == 1;
        }
    }

    // iterative?
}
