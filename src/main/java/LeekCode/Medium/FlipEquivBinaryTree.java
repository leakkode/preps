package LeekCode.Medium;

import LeekCode.DataStructure.TreeNode;

public class FlipEquivBinaryTree {
    public boolean T(TreeNode node1, TreeNode node2) {
        if (node1==null && node2==null) {
            return true;
        }else if ((node1==null && node2!=null) || (node1!=null && node2==null)) {
            return false;
        }

        boolean result = true;
        result = result && T(node1.left, node2.right);
        result = result && node1.val == node2.val;
        result = result && T(node1.right, node2.left);

        return result;
    }


    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return T(root1, root2);
    }
}
