package com.Basics.Trees.QuesHashMap;

import com.Basics.Trees.Questions.DFS.TreeNode;

import java.util.HashMap;

public class ConstructBTfromPre_InOrder {
    // Using HashMaps
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i] , i);
        }

        int[] index = {0};
        return helper(preorder, inorder, 0, preorder.length-1, map, index);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left , int right, HashMap<Integer,Integer> map, int[] index){
        if(left> right){
            return null;
        }

        int current = preorder[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);

        if(left == right) {
            return node; // at leaf node
        }

        int inorderIndex = map.get(current);
        node.left = helper(preorder, inorder, left , inorderIndex-1, map, index);
        node.right = helper(preorder, inorder, inorderIndex+1, right, map, index);

        return node;
    }
}
