package com.Basics.Stack_Queue;

public class StackMain {
    public static void main(String[] args) throws CustomStackException {
//        CustomStack stack= new CustomStack(5);
//        stack.push(3);
//        stack.push(31);
//        stack.push(311);
//        stack.push(3111);
//        stack.push(3111);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); exception


        DynamicStack stack= new DynamicStack(5);
//        CustomStack stack= new DynamicStack (5);
        stack.push(3);
        stack.push(31);
        stack.push(311);
        stack.push(3111);
        stack.push(3111);
        stack.push(3333);
        stack.push(33553);
        stack.push(35);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
