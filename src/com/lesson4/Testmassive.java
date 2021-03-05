package com.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Testmassive {
    public static void main(String [] args){
        Random rand = new Random();

        int [] mas = new int [100];

        for (int x = 0; x < mas.length; x++) {
            mas[x] = rand.nextInt(10000);
        }
        int genius = 0;
        int min = 10000;
        int max = 0;
        int amount_counter = 0;
        for (int element: mas){
            if (element>max){
                max = element;
            }
            if (element<min){
                min = element;
            }
            if (element%10==0){
                amount_counter++;
                genius =  genius + element;
            }
        }
        /*int summ_count = 0;

        int [] mas_summ = new int[amount_counter];

        for (int i:mas){
            if (i%10==0){
                mas_summ [summ_count] = i;
                summ_count++;
            }
        }
        int result=0;
        for (int i:mas_summ){
            result+=i;
        }*/ //genius

        System.out.println(max);
        System.out.println(min);
        System.out.println(amount_counter);
        System.out.println(genius);
    }
}
