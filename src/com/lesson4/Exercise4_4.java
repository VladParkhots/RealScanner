package com.lesson4;

import java.util.Random;

public class Exercise4_4 {
    public static void main(String [] args){
        Random rand = new Random();

        int bestResult = 0;
        int index = 0;

        int [] mas = new int [100];
        for (int i= 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10000);
        }

        for (int i= 0; i < mas.length; i++){

            int x = i-1;
            int y = i+1;

            if (i == 0){
                continue;
            }
            if (i == mas.length-1){
                continue;
            }
            System.out.print(mas[x]+" "+mas[i] + " "+ mas[y]);

            int resultOf3 = mas[x] + mas[i] + mas[y];
            System.out.println(" = "+ resultOf3);
            if (resultOf3 > bestResult){
                bestResult = resultOf3;
                index = x;
            }
        }
        System.out.println(bestResult);
        System.out.println(index);
    }
}
