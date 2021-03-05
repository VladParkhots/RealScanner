package com.secondlesson;

public class IfElse {
    public static void main(String [] args){
        int myInt = -1;
        if (myInt>=10){
            System.out.println("10 or more");
        } else if (myInt>=0) {
            System.out.println("from 0 to 9");
        } else {
            System.out.println("less than 0");
        }
    }
}
