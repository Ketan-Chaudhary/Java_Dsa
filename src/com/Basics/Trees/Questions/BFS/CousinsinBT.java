package com.Basics.Trees.Questions.BFS;

public class CousinsinBT {
//    https://leetcode.com/problems/cousins-in-binary-tree/

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (
                ( level(root,xx,0)== level(root,yy,0)) && (!isSiblings(root,xx,yy))
        );
    }

    TreeNode findNode(TreeNode node, int x){
        if(node==null){
            return null;
        }
        if(node.val==x){
            return node;
        }

        TreeNode lft = findNode(node.left,x);
        if(lft!=null){
            return lft;
        }
        return (findNode(node.right,x));
    }

    boolean isSiblings(TreeNode node, TreeNode x, TreeNode y){
        if(node==null){
            return false;
        }

        return(
                (node.left == x && node.right == y) || (node.left == y && node.right == x)
                        || isSiblings(node.left,x,y) || isSiblings(node.right,x,y)
        );
    }

    int level (TreeNode node, TreeNode x, int levl){
        if(node==null) return 0;

        if(node == x) return levl;

        int l = level(node.left,x,levl+1);
        if(l!=0){
            return l;
        }

        return (level(node.right,x,levl+1));
    }

}
