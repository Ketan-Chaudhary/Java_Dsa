package com.Basics.Trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Populate
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node value :");
        int value= scanner.nextInt();
        root= new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter the left node :" + node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left node of  " + node.value);
            int value= scanner.nextInt();
            node.left= new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter the right node of : " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node of : "+ node.value);
            int value= scanner.nextInt();
            node.right= new Node(value);
            populate(scanner,node.right);
        }
    }

    // Display function
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    // Traversal Methods
    // 1. Pre-order: N->L->R
    // 2. In-order: 1L->N->R
    // 3. Post-order: L->R->N

    // Pre order
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

        // Post-order
    } public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);

        // In order
    } public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
}
