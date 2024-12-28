package org.example;

public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(capacity==size()){
            expand();
        }

        stack[top] = data;
        top++;


    }
    private void expand(){
        int length = size();
        //creating a new stack
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity = capacity*2;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            top--;
            stack[top] = 0;
            shrink();
        }
    }

    private void shrink(){
        if(size()<=capacity/2){
            int length = size();
            int[] newStack = new int[capacity/2];
            System.arraycopy(stack,0,newStack,0,length);
            stack = newStack;
            capacity = capacity/2;
        }
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }


    public void peak(){
        System.out.println(stack[top-1]);
    }

    public void show(){
        for(int n : stack){
            System.out.print(n+" | ");
        }
        System.out.println();
    }

}
