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

    // Questions
    public void removeDuplicate(){
        Node node = head;
        while(node.next!=null){
            if (node.value == node.next.value) {
                node.next= node.next.next;
                size--;
            }
            else {
                node= node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    // Merge two Sorted Linked List
    public static LL merge (LL first, LL second){
        Node f= first.head;
        Node s= second.head;
        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f= f.next;
            } else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

    // Bubble Sort
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // Recursive reversal of the Linked List
     private void reversalR(Node node) {
        if(node==tail){
            head=tail;
            return;
        }
        reversalR(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    public static void main(String[] args) {
        LL first= new LL();
        LL second= new LL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(8);
        first.insertLast(9);
        first.insertLast(11);
        second.insertLast(3);
        second.insertLast(4);
        second.insertLast(7);
        second.insertLast(10);
        second.insertLast(12);
        second.insertLast(13);

        LL ans= merge(first,second);
        ans.display();
    }
}
