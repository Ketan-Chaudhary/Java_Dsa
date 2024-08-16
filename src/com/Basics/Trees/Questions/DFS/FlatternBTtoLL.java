package com.Basics.Trees.Questions.DFS;

public class FlatternBTtoLL {
//    https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

    public void flatten(TreeNode root) {
        if(root == null) return ;

        TreeNode current = root;
        while(current!=null){
            if(current.left!=null){
                TreeNode temp = current.left;
                // find the rightmost empty space
                while(temp.right!=null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current= current.right;
        }
    }
}
