package com.Basics.LinkedList;

public class LL {
    // Non-continuous memory allocated data structure
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    // Insert node at start
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    // Insert node at last
    public void insertLast(int val){
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }
    // Insert at particular index
    public void insert(int val, int index){
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size ) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next= node;
        size++;
    }

    // Insert Using Recursion
    public void insertR(int val, int index){
        head=insertR(val,index,head);
    }
    private Node insertR(int val, int index , Node node){
        if (index == 0) {
            Node temp= new Node(val,node);
            size++;
            return temp;
        }
        node.next= insertR(val,index-1,node.next);
        return node;
    }

    // get any Node by index
    public Node get(int index){
        Node node =head;
        for (int i = 0; i <index; i++) {
            node=node.next;
        }
        return node;
    }

    // find and node by value
    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node= node.next;
        }
        return null;
    }

    // Delete the first node
    public void deleteFirst(){
        // int val = node.value;
        if (head==null){
            return;
        }
        head = head.next;
        size--;
        return;
    }
    //Delete the last node
    public void deleteLast(){
        if (head.next==null){
            deleteFirst();
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp= temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    // Delete from a particular index
    public void delete(int index){
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index==size){
            deleteLast();
        }
        Node prev= get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        size--;
    }

    // Display
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.value+ " ->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // Node Structure
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node (int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
