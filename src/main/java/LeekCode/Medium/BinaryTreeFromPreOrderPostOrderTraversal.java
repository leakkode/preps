package LeekCode.Medium;

import LeekCode.DataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTreeFromPreOrderPostOrderTraversal {

    public TreeNode constructFromPrePost_online_solution(int[] pre, int[] post) {
        Deque<TreeNode> s = new ArrayDeque();
        s.offer(new TreeNode(pre[0]));
        for (int i = 1, j = 0; i < pre.length; ++i) {
            TreeNode node = new TreeNode(pre[i]);
            while (s.getLast().val == post[j]) {
                s.pollLast(); j++;
            }
            if (s.getLast().left == null) {
                s.getLast().left = node;
            }
            else {
                s.getLast().right = node;
            }
            s.offer(node);
        }
        return s.getFirst();
    }

    public TreeNode constructFromPrePost_online_solution2(int[] pre, int[] post) {
        return buildTree(pre, post, 0, post.length - 1, new int[]{0});
    }

    TreeNode buildTree(int[] pre, int[] post, int left, int right, int[] index) {
        if(left > right) return null;

        index[0]++;
        TreeNode root = new TreeNode(post[right]);
        if(left == right) return root;

        int i = left;
        while(i <= right && post[i] != pre[index[0]])
            i++;

        root.left = buildTree(pre, post, left, i, index);
        root.right = buildTree(pre, post, i + 1, right - 1, index);
        return root;
    }
}
