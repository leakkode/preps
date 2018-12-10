package LeekCode.Medium;

import org.junit.jupiter.api.Test;

public class BinaryTreeFromPreOrderPostOrderTraversalTests {

    @Test
    public void baseTest() {
        int[] pre = new int[]{1,2,4,5,3,6,7};
        int[] post = new int[]{4,5,2,6,7,3,1};

        new BinaryTreeFromPreOrderPostOrderTraversal().constructFromPrePost_online_solution(pre, post);
    }

    @Test
    public void baseTest2() {
        System.out.println( 3 & 2);
    }
}
