package LeekCode.Medium;

import java.util.Arrays;

public class StoneGame {


    // this is to get Alex's score. // wrong
//    public int getAlexScore(int[] arr, int L, int R, boolean alexsturn) {
//        if (L>R) {
//            return 0;
//        }
//
//        int sum = alexsturn? Math.max(arr[L], arr[R]) : 0;
//        if (arr[L] > arr[R]) {
//
//            return sum + getAlexScore(arr, L + 1, R, !alexsturn);
//        } else if (arr[L] < arr[R]) {
//
//            return sum + getAlexScore(arr, L, R - 1,!alexsturn);
//        } else {
//            // arr[L] == arr[R]
//            return Math.max(sum + getAlexScore(arr, L + 1, R, !alexsturn), sum + getAlexScore(arr, L, R - 1, !alexsturn));
//        }
//    }

    public int getAlexScore(int[] arr, int L, int R, int alexScore, int leeScore, boolean alexTurn) {
        if (L > R) {
            System.out.println(alexScore);
            return alexScore;
        }

        int H_score = arr[L];
        int T_score = arr[R];
        int H = getAlexScore(arr, L + 1, R, alexTurn ? alexScore + H_score : alexScore, alexTurn ? leeScore : leeScore + H_score, !alexTurn);
        int T = getAlexScore(arr, L, R - 1, alexTurn ? alexScore + T_score : alexScore, alexTurn ? leeScore: leeScore + T_score, !alexTurn);
        return Math.max(H, T);
    }

    public Boolean WillAlexWin(int[] arr, int L, int R, int alexScore, int leeScore, boolean alexTurn) {

        if (L > R) {
            System.out.format("%s\tAlex's score: %d\tLee's score: %d\n", Arrays.toString(arr), alexScore, leeScore);
            return alexScore >= leeScore;
        }

        int H_score = arr[L];
        int T_score = arr[R];
        Boolean H = WillAlexWin(arr, L + 1, R, alexTurn ? alexScore + H_score : alexScore, alexTurn ? leeScore : leeScore + H_score, !alexTurn);
        Boolean T = WillAlexWin(arr, L, R - 1, alexTurn ? alexScore + T_score : alexScore, alexTurn ? leeScore : leeScore + T_score, !alexTurn);

        return H || T;
    }


    public Boolean WillAlexWin(int[] arr, boolean head, int counter, boolean alexsturn, int alexScore, int leeScore) {
        if (counter>=arr.length) {
            System.out.format("%s\tAlex's score: %d\tLee's score: %d\n", Arrays.toString(arr), alexScore, leeScore);

            return alexScore > leeScore;
        }
        int score = 0;
        if (head) {
            score = arr[counter];
        } else {
            score = arr[arr.length - 1 - counter];
        }

        if (alexsturn) {
            alexScore += score;
        } else {
            leeScore += score;
        }

        boolean H = WillAlexWin(arr, head, counter + 1, !alexsturn, alexScore, leeScore);
        boolean T = WillAlexWin(arr, !head, counter + 1, !alexsturn, alexScore, leeScore);
        return H || T;
    }

    // TODO: for a DP solution: the idea is to add memoization to the recurisve func.
    // the catch is, what should the index for the cache?
    public Boolean WillAlexWinDP(int[] arr, int L, int R, boolean alexsturn, int alexScore, int leeScore, int[] cache) {
//        if (L>R) {
//            System.out.format("%s\tAlex's score: %d\tLee's score: %d\n", Arrays.toString(arr), alexScore, leeScore);
//            return alexScore > leeScore;
//        }
//
////        if (cache[L]!=0) {
////            return cache[L] == 1;
////        }
////
////        if (cache[R]!=0) {
////            return cache[R] == 1;
////        }
//
//        Boolean head = WillAlexWin(arr, L + 1, R, !alexsturn, alexsturn? alexScore + arr[L] : alexScore, alexsturn ? leeScore : leeScore + arr[R]);
//        Boolean tail = WillAlexWin(arr, L, R - 1, !alexsturn, alexsturn? alexScore + arr[R] : alexScore, alexsturn ? leeScore : leeScore + arr[L]);
//        return head || tail;
        return true;
    }

    //TODO: as an exercise, print the best path.
}
