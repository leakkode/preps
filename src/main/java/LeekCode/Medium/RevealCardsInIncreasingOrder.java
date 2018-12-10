package LeekCode.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
//    public int[] deckRevealedIncreasing(int[] deck) {
//        int n = deck.length;
//        int[] result = new int[n];
//        Arrays.sort(deck);
//        Queue<Integer> q = new LinkedList(); // Queue for all available indices
//        for (int i = 0; i < n; i++) {
//            q.offer(i);
//        }
//        int p = q.poll();
//        for (int i = 0; i < n; i++) {
//            System.out.println(p);
//            result[p] = deck[i];
//            if (i < n - 1) {
//                q.offer(q.poll()); // Skip one available index
//                p = q.poll(); // Next available index
//            }
//        }
//        return result;
//    }

    private void debug(Queue<Integer> q) {
        for (Integer i : q) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        // sort and push/pop queue
        Arrays.sort(deck);
        Queue<Integer> s = new LinkedList();
        int[] res = new int[deck.length];
        for (int i=0; i<deck.length; i++) s.add(i);

        int index = s.poll();
        for (int i=0; i<deck.length-1; i++) {
            res[index] = deck[i];
            s.add(s.poll());
            index = s.poll();
            debug(s);

        }
        res[index] = deck[deck.length-1];

        return res;
    }
}
