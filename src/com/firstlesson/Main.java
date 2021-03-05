package com.firstlesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String input = s.nextLine();
        System.out.println("Вы ввели: " + input);

    }
}
