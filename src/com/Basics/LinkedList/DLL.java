package com.Basics.LinkedList;

public class DLL {
    // contains address of both previous and next node
    private Node head;

    // Find
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Insert First
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Insert Last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    // Insert
    public void insert(int after, int val){
        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }
    }

    // Display
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    // Node structure
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
        }
        public Node (int value, Node next , Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
