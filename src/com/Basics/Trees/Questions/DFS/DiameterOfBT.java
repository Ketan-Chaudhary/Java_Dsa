package com.Basics.Trees.Questions.DFS;

public class DiameterOfBT {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);

        return diameter;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight+rightHeight;
        diameter = Math.max(diameter,dia);

        return Math.max(leftHeight,rightHeight)+1;
    }
}
