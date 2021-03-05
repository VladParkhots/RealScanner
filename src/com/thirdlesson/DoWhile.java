package com.thirdlesson;

import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        /*int value = scan.nextInt();
        while (value!=5){
            System.out.println("Введи 5!");
            value = scan.nextInt();
        }
        System.out.println("Вы ввели 5");*/
        int value;
        do{
            System.out.println("Введи 5");
            value = scan.nextInt();
        } while (value!=5);

        System.out.println("Вы ввели 5");

    }
}
