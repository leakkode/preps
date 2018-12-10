package Concept.Algorithm.General.Permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutations {

    //iterative approach
    private void perm1(String prefix, String s, List<String> list) {
        int n = s.length();
        if (n == 0) {
            System.out.println(prefix);
            list.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++) {
                String pf = prefix + s.charAt(i);
                String ss = s.substring(0, i) + s.substring(i + 1, n);
                perm1(pf, ss, list);
            }
        }
    }

    /* approach 2 */
    // swap //
    public static void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(new String(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }


    public List permute(String elements) {
        List results = new ArrayList();
        perm1("", elements, results);
        return results;
    }

    public List permuteBitApproach(String S) {
        final int len = S.length();
        int n = (int)Math.pow(2, len);
        char[] chars = S.toCharArray();
        List<String> set = new ArrayList();
        for (int i=0; i<n; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) > 0) {
                    sb.append(chars[j]);
                }
            }
            System.out.println(sb.toString());
            // warning: bad code, super slow
            // do not do this
//            int bitmask = 1;
//            int j = 0;
//            StringBuilder sb = new StringBuilder();
//            while (j < len) {
//
//                if ( (bitmask & i) > 0 ) {
//                     sb.append(chars[j]);
//                }
//                bitmask = bitmask << 1;
//                j++;
//            }
//            set.add(sb.toString());
        }

        return set;
    }

}
