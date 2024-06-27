package com.Basics.Stack_Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE= 10;
    int end =0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data= new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty !!");
        }
        int removed = data[0];
        // shifting the queue
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i]; // O(n) times
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("END");
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        return data[0];
    }


    public boolean isFull() {
        if (end== data.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return end ==0;
    }
}
