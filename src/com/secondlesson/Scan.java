package com.secondlesson;


import java.util.Scanner;

public class Scan {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("введите данные - ");
        String input = s.nextLine();
        System.out.println("вы ввели - "+input);
    }
}