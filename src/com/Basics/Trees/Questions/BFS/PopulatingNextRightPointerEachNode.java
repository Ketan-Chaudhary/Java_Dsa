package com.Basics.Trees.Questions.BFS;

public class PopulatingNextRightPointerEachNode {
//    https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
public Node connect(Node root) {
    if(root==null){
        return null;
    }

    Node leftMost = root;

    while(leftMost.left!=null){
        Node current = leftMost;
        // level traversal
        while(current!=null){
            current.left.next = current.right;
            if(current.next!=null){
                current.right.next= current.next.left; // bridge
            }
            current= current.next; // traverse towards right on a level
        }
        leftMost = leftMost.left;
    }
    return root;
}
    // Space Complexity: O(1)




    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
