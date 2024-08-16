package com.Basics.Trees.Questions.DFS;

public class LowestCommAncestorofBT {
//    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!= null) return root;

        return left == null ? right:left;
    }
}
