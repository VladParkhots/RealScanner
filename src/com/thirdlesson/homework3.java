package com.thirdlesson;

import java.util.Scanner;

public class homework3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите город:");
            String s = scan.nextLine();
            if (s.equals("Стоп")) {
                break;
            }
            switch (s) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим", "Милан", "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        } // City>Country
        /*while (true){

            System.out.println("Введите делимое:");
            double x = scan.nextDouble();
            System.out.println("Введите делитель:");
            double y = scan.nextDouble();
            if (y==0){
                System.out.println("Деление на ноль невозможно");
                break;
            }
            double result = x / y;
            System.out.println("Результат: " +result);
        } //Деление while*/ // Деление while
        /*double y;
        do {
            System.out.println("Введите делимое:");
            double x = scan.nextDouble();
            System.out.println("Введите делитель:");
            y = scan.nextDouble();
            double result = x / y;
            System.out.println("Результат: " +result);
        } while (y!=0);
        System.out.println("Деление на ноль невозможно");*/ // Деление do while
        /*int counter = 0;
        while (counter < 5){
            counter++;
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if (y==0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(x / y);
        }*/ // хзхзхзхзхзхз
    }
}
