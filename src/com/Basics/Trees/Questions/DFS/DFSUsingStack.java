package com.Basics.Trees.Questions.DFS;

import java.util.Stack;

public class DFSUsingStack {
    void dfs(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode deleted = st.pop();
            System.out.print(deleted.val + " ");
            if(deleted.right != null){
                st.push(deleted.right);
            }
            if(deleted.left != null){
                st.push(deleted.left);
            }
        }
    }
}
