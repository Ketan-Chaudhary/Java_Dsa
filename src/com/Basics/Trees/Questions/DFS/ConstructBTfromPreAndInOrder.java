package com.Basics.Trees.Questions.DFS;
import java.util.Arrays;

public class ConstructBTfromPreAndInOrder {
//    https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;

        int root = preorder[0];

        int index = 0;
        // finding index of root node in Inorder
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==root){
                index = i;
            }
        }

        TreeNode rootNode = new TreeNode(root);
        rootNode.left = buildTree(Arrays.copyOfRange(preorder,1,index+1) , (Arrays.copyOfRange(inorder,0,index+1)));
        rootNode.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length), Arrays.copyOfRange(inorder,index+1,inorder.length));

        return rootNode;
    }
}