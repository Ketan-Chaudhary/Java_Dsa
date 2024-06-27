package com.Basics.Stack_Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE= 10;
    int end =0;
    int front=0;
    int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data= new int[size];
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]= item;
        end=end% data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("! Queue is Empty !");
        }
        int removed =data[front++];
        front=front% data.length;
        size--;
        return removed;
    }

    public void display(){
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        return data[front];
    }


    public boolean isFull() {
        if (size== data.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return size ==0;
    }
}
