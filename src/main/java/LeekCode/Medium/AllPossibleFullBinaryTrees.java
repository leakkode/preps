package LeekCode.Medium;

import LeekCode.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees {



    public static List<TreeNode> process(int N) {
        List<TreeNode> result = new ArrayList();

        if (N==1) {
            result.add(new TreeNode(0));
            return result;
        }

        N = N - 1;
        for (int i=1; i<N; i=i+2) {
            List<TreeNode> left = process(i);
            List<TreeNode> right = process(N - i);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(0);
                    node.left = l;
                    node.right = r;
                    result.add(node);
                }
            }

        }

        return result;

    }
}
