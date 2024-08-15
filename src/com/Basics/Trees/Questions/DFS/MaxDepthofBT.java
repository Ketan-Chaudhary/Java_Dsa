package com.Basics.Trees.Questions.DFS;

public class MaxDepthofBT {
//    https://leetcode.com/problems/maximum-depth-of-binary-tree/

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);


        // Math.max(left,right)=> edges
        // +1 is no of nodes
        int depth = Math.max(left,right) +1;
        return depth;
    }
}
