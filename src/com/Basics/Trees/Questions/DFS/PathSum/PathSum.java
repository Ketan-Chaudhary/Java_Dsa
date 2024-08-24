package com.Basics.Trees.Questions.DFS.PathSum;

import com.Basics.Trees.Questions.DFS.TreeNode;

public class PathSum {
    // https://leetcode.com/problems/path-sum/description/

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.val == targetSum && root.left == null && root.right == null) return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
