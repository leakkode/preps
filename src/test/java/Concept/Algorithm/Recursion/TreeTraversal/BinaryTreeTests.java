package Concept.Algorithm.Recursion.TreeTraversal;

import Concept.Algorithm.TreeTraversal.BinaryTree;
import Concept.DataStructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BinaryTreeTests {

//    Input:
//
    //            1
   //            / \
  //            2   3
 //            /   / \
//            4   5   6
   //            /
  //            7
    @Test
    public void baseCase() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        one.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;

        new BinaryTree().inorderTraversal(one);
    }

    @Test
    public void baseCase2() {
        List<Integer> list = new ArrayList();
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        one.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;

        List<Integer> result = new BinaryTree().inorderTraversal(one, list);
        System.out.println(result);
    }

    @Test
    public void baseCase3() {
        List<Integer> list = new ArrayList();
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        one.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;

        List<Integer> result = new BinaryTree().inorderTraversal_RTL(one, list);
        System.out.println(result);
    }

    @Test
    public void baseCase4() {
        Integer[] nums = {2,4,1,6,3,7,9,5};
        TreeSet<Integer> tree = new TreeSet(Arrays.asList(nums));

        for(int s: tree){
            System.out.println(s);
        }
        System.out.println();
    }

}
