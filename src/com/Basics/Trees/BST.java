package com.Basics.Trees;

public class BST {

    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value= value;
        }
    }

    public BST() {

    }

    private Node root;

    public void insert(int value){
        root= insert(value,root);
    }
    private Node insert(int value, Node node){
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left= insert(value,node.left);
        }
        if (value > node.value) {
            node.right= insert(value,node.right);
        }
        node.height= Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void populate(int[] arr){
        for (int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr){
        populatedSorted(arr,0,arr.length);
    }
    private void populatedSorted(int[] arr, int start,int end){
        if (start >= end) {
            return;
        }
        int mid = (start+end)/2;
        this.insert(arr[mid]);
        populatedSorted(arr,start,mid);
        populatedSorted(arr,mid+1,end);
    }

    public void display(){
        display(this.root,"Root Node :");
    }
    private void display(Node node, String details){
        if (node == null) {
            return;
        }
        System.out.println(details+ node.value);
        display(node.left,"left Child of :" + node.value + ":");
        display(node.right,"right Child of :" + node.value+ ":");
    }

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }
}
