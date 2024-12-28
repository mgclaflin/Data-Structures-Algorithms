package org.example;

import java.sql.SQLOutput;

public class Stack {
    //size of array set statically, this can be changed to accept a parameter from the user
    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if(top==5){
            System.out.println("stack is full");
        }
        else{
            stack[top] = data;
            top++;
        }

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            top--;
            stack[top] = 0;
        }


    }

    public void size(){
        System.out.println("The size of the array is "+top);
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
