package Concept.Algorithm.Recursion.Backtracking;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        final int[] chars = new int[256];

        for (int i=0; i<order.length(); i++) {
            chars[(int)order.charAt(i)] = i;
        }
        final int len = words[0].length();
        for (int i=1; i<words.length; i++) {

            if (words[i].length() > words[i-1].length()) {

            } else {
                return false;
            }
        }

//         int len = words[0].length();
//         for (int k=0; k<len; k++) {
//             int order_so_far = chars[(int)words[0].charAt(k)];

//             for (int i=1; i<words.length; i++) {
//                 int c = (int)words[i].charAt(k);
//                 int this_order = chars[c];
//                  System.out.format("kc: %c, c: %c, chars[cc]: %d, order_so_far: %d, this_order: %d\n", words[0].charAt(k), (char)c, chars[c], order_so_far, this_order);
//                 if (this_order < order_so_far) {

//                     return false;
//                 }
//                 order_so_far = this_order;
//             }
//         }


//         StringBuilder sb = new StringBuilder();
//         for (int i=0; i<words.length; i++) {
//             String word = words[i];
//             sb.append(word);
//         }

//         String allWords = sb.toString();
//         char c = allWords.charAt(0);
//         int last_c_order = chars[(int)c];
//         for (int i=1; i<allWords.length(); i++) {
//             int cc = (int)allWords.charAt(i);
//             System.out.format("cc: %c, chars[cc]: %d, last_c_order: %d\n", (char)cc, chars[i], last_c_order);
//             if (chars[cc] < last_c_order) {
//                 return false;
//             }
//             last_c_order = chars[cc];
//         }

        return true;
    }
}