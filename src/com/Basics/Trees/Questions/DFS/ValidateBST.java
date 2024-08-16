package com.Basics.Trees.Questions.DFS;

public class ValidateBST {
//    https://leetcode.com/problems/validate-binary-search-tree/description/

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null) return true;

        if(low != null && low >= node.val){
            return false;
        }

        if(high != null && high <= node.val){
            return false;
        }

        boolean leftTree = helper(node.left, low , node.val);
        boolean rightTree = helper(node.right, node.val , high);

        return leftTree && rightTree;
    }
}
