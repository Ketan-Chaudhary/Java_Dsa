package com.Basics.Trees.Questions.DFS.PathSum;
import com.Basics.Trees.Questions.DFS.TreeNode;

public class SumRoottoLeafNumbers {
    // https://leetcode.com/problems/sum-root-to-leaf-numbers/

    public int sumNumbers(TreeNode root) {
        return helper(root , 0);
    }

    int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        sum = sum*10 + node.val;

        if(node.left == null && node.right == null){
            return sum;
        }

        return helper(node.left,sum) + helper(node.right , sum);
    }
}
