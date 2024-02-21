package com.code.lambdasstreams;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */

//Sol:-
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }


}
public class ProblemThree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode leftChild1 = new TreeNode(3);
        TreeNode rightChild1 = new TreeNode(8);

        TreeNode leftChild2 = new TreeNode(1);
        TreeNode rightChild2 = new TreeNode(6);
        root.left = leftChild1;
        root.right = rightChild1;
        leftChild1.left = leftChild2;
        leftChild1.right = rightChild2;
        if(checkBST(root)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    private static boolean checkBST(TreeNode node) {
        if(node==null)
            return true;
        if(node.left!=null && maxValue(node.left)>node.val)
            return false;
        if(node.right!=null && minValue(node.right)<node.val)
            return false;
        if(!checkBST(node.left) && !checkBST(node.right))
            return false;

        return true;
    }

    private static int minValue(TreeNode right) {
        if(right==null)
            return Integer.MAX_VALUE;
        int val = right.val;
        int leftMin = minValue(right.left);
        int rightMin = minValue(right.right);

        return Math.min(val,Math.min(leftMin,rightMin));
    }

    private static int maxValue(TreeNode left) {
        if(left==null)
            return Integer.MIN_VALUE;
        int val = left.val;
        int leftMax = maxValue(left.left);
        int rightMax = maxValue(left.right);

        return Math.max(val,Math.max(leftMax,rightMax));
    }
}
