package com.Basics.Stack_Queue;

import java.util.Deque;

public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE= 10;
    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
   public CustomStack(int size){
        this.data= new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws CustomStackException {
        if(isEmpty()){
            throw new CustomStackException("Can't pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws CustomStackException{
        if (isEmpty()){
            throw new CustomStackException("Can't get the element from empty stack");
        }
        return data[ptr];
    }

    private boolean isFull() {
        if (ptr== data.length-1){
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        return ptr ==-1;
    }
}
