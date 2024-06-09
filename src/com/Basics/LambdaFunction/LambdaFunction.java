package com.Basics.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        // It takes consumer class as input
        // one line function
//        list.forEach((item)-> System.out.println(item*2));


        // Creating a Consumer
        Consumer<Integer> fun= (item)-> System.out.println(item*2);
        list.forEach(fun); // Works as same as the above code is working

        Operation sum = (a,b)-> a+b;
        Operation sub= (a,b)-> a-b;
        Operation prod =(a,b)-> a*b;
        LambdaFunction myCal= new LambdaFunction();
        System.out.println(myCal.operate(3,5,sum));
        System.out.println(myCal.operate(4,2,sub));
        System.out.println(myCal.operate(2,2,prod));
    }

    private  int operate(int a,int b , Operation op){
        return op.operation(a,b);
    }

    interface Operation{
        int operation (int a, int b);
    }
}


