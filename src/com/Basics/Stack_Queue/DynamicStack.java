package com.Basics.Stack_Queue;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (isFull()){

            int[] temp = new int[data.length*2];
            // copy elements
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }

        return super.push(item);
    }
}
