package com.Basics.Trees;

public class AVL {

    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value= value;
        }
    }

    public AVL() {

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
        return rotate(node);
    }

    private Node rotate (Node node){
        // Left Heavy
        if (height(node.left)-height(node.right)>1){
            if (height(node.left.left)-height(node.left.right)>0){
                // Left Left Case
                return rightRotate(node);
            }
            if (height(node.left.left)- height(node.left.right)<0){
                // Left Right Case
                node.left= leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right Heavy
        if (height(node.left)-height(node.right)<-1){
            if (height(node.right.left)-height(node.right.right)<0){
                // Right Right Case
                return leftRotate(node);
            }
            if (height(node.right.left)-height(node.right.right)>0){
                // Left Right Case
                node.right= rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c =p.left;
        Node t= c.right;
        c.right=p;
        p.left=t;
        // re height calculation
        p.height= Math.max(height(p.left),height(p.right)+1);
        c.height= Math.max(height(c.left),height(c.right)+1);
        return c;
    }

    public Node leftRotate(Node c){
        Node p= c.right;
        Node t= p.left;
        p.left=c;
        c.right=t;
        //
        p.height= Math.max(height(p.left),height(p.right)+1);
        c.height= Math.max(height(c.left),height(c.right)+1);
        return p;
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
