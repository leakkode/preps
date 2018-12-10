package Concept.Algorithm.TreeTraversal;

import Concept.DataStructure.TreeNode;

public class BinaryTreeFromArray {
    int index = 0;

    // i need a global counter..
    public TreeNode preorderFromArray(int[] values, int i, int d) {
        index = index + i;
        final int D = (int) (Math.log(values.length) / Math.log(2)) + 1;

        if (d>=D-1 ) {
            if (index>=values.length) {
                return null;
            }
            return new TreeNode(values[index]);
        }

        if (index>=values.length) {
            return null;
        }

        TreeNode node = new TreeNode(values[index]);
        node.left = preorderFromArray(values, 1, d+1);
        node.right = preorderFromArray(values, 1, d+1);

        return node;
    }

    // TODO: can you work out a version without a global counter
    public TreeNode preorderFromArray() {
        // probably similar to above, but with a stack/queue/linkedlist so u can move to head/tail..
        return null;
    }

    //TODO: postorder from array
    public TreeNode postorderFromArray() {
        return null;
    }
}
