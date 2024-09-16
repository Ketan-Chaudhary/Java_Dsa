package com.Basics.Trees.QuesHashMap;

public class CorrectBTwhoseTwoNodesareSwapped {
    // there is a Binary sorted Tree where two nodes are swapped which violates the sorted tree
    // correct the tree

    Node first;
    Node second;
    Node prev;

    public void helper(Node root){
        iot(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        // we can swap entire node as well
    }

    private void iot(Node node){
        if(node == null) return;

        iot(node.left);

        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;
        iot(node.right);
    }

}


class Node {
    int val;
    Node left;
    Node right;
    public Node (int val) {
        this.val = val;
    }
}