package Concept.Algorithm.TreeTraversal;

import Concept.DataStructure.TreeNode;

import java.util.List;

public class BinaryTree {

//    public int traverse(TreeNode node) {
//        if (node.left == null && node.right == null) {
//            return node.val;
//        }
//
//
//
//    }


    public void inorderTraversal(TreeNode node) {
        // base condition
        if (node == null) {
            return;
        }

        // traveral
        inorderTraversal(node.left);
        System.out.println(node.val);
        inorderTraversal(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return null;
        }

        // traveral
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return null;
        }

        // traveral
        list.add(node.val);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
        return list;
    }


    // TODO:
    public List<Integer> inorderTraversal_RTL(TreeNode node, List<Integer> list) {
        if (node == null) {
            return list;
        }

        // traveral
        inorderTraversal_RTL(node.right, list);
        list.add(node.val);
        inorderTraversal_RTL(node.left, list);

        return list;
    }



}
