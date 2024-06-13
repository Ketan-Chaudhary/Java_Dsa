package com.Basics.LinkedList;

public class CLL {
    // tail->next = head
    private Node head;
    private Node tail;
    public CLL(){
        this.head=null;
        this.tail=null;
    }

    // Insert
    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    // Display
    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.val + "->");
                if (node.next!=null){
                    node=node.next;
                }
            } while (node!=head);
        }
        System.out.println("HEAD");
    }

    // Delete
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    // Node Structure
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
}
