package com.Basics.Trees.Questions.DFS.PathSum;
import com.Basics.Trees.Questions.DFS.TreeNode;

public class BTMaxPathSum {
//    https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        // Ignoring negative valued path
        left = Math.max(0,left);
        right = Math.max(0,right);


        // calculating path Sum
        int pathSum = left + right + node.val;
        // Updating global maximum
        ans = Math.max(ans, pathSum);

        return Math.max(left , right) + node.val;
    }

}