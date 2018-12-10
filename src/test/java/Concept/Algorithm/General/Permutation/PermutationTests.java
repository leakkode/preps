package Concept.Algorithm.General.Permutation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutationTests {

    @Test
    public void basetest() {
        new Permutations().permute("abcde");
    }

    @Test
    public void basetest2() {
        Permutations.perm2("abcde");
    }

    @Test
    public void basetest3() {
//        System.out.println(new Permutations().permuteBitApproach("abcd"));
//        System.out.println(new Permutations().permuteBitApproach("aaa"));
        System.out.println(new Permutations().permuteBitApproach("aba"));

    }

}
