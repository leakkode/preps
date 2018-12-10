package Concept.Algorithm.Recursion.TreeTraversal;

import Concept.Algorithm.TreeTraversal.BinaryTree;
import Concept.Algorithm.TreeTraversal.BinaryTreeFromArray;
import Concept.DataStructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeFromArrayTests {

    @Test
    public void baseCase() {
        int[] preorder = new int []{1,2,4,5,3,6,7};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }

    @Test
    public void baseCase2() {
        int[] preorder = new int []{1,2,4,5,3,6};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }

    @Test
    public void baseCase3() {
        int[] preorder = new int []{1,2,4,5,3};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }

    @Test
    public void baseCase4() {
        int[] preorder = new int []{1,2};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }

    @Test
    public void baseCase5() {
        int[] preorder = new int []{1};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }

    @Test
    public void baseCase6() {
        int[] preorder = new int []{4,2,1,3};
        TreeNode root = new BinaryTreeFromArray().preorderFromArray(preorder, 0, 0);

        List<Integer> list = new ArrayList();
        new BinaryTree().preorderTraversal(root, list);
        System.out.println(Arrays.toString(preorder));
        System.out.println(list);
    }
}
