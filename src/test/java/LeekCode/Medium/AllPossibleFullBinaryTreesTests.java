package LeekCode.Medium;

import LeekCode.DataStructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AllPossibleFullBinaryTreesTests {

    // is this correct for in-traversal?
    void printTrees(TreeNode node) {
        if (node == null) {
            return;
        }

        printTrees(node.left);
        System.out.print(node.val);
        printTrees(node.right);
    }

    @Test
    void baseCase() {
        // N = 5;
        List<TreeNode> possiblities =  AllPossibleFullBinaryTrees.process(7);
//        for (TreeNode root : possiblities) {
//
//        }

    }
}
