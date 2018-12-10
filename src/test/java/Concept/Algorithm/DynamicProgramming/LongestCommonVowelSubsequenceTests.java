package Concept.Algorithm.DynamicProgramming;

import Concept.Algorithm.DynamicProgramming.Longest.LongestCommonVowelSubsequence;
import org.junit.jupiter.api.Test;

public class LongestCommonVowelSubsequenceTests {

    @Test
    public void baseTest() {
        String M = "aieef";
        String N = "klaief";
        System.out.println(new LongestCommonVowelSubsequence().LCVS_tabulation(M, N));
    }
}
