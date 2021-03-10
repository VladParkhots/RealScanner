//С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
// его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива

package com.lesson4;
import java.util.Scanner;
import java.util.Random;

public class massive {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int n = scan.nextInt();
        int [] mas = new int [n];
        int x;
        int count_eight = 0;
        int count_one =0;
        int even = 0;
        int odd = 0;

        for (x=0;x<n;x++) {
            mas[x] = rand.nextInt(10);
            System.out.print(mas[x] +" ");

            if (mas [x]>8){
                count_eight++;
            }
            if (mas [x]==1){
                count_one++;
            }
            if (mas [x]%2==0 && mas [x]!=0) {
                even++;
            }
            if (mas [x]%2!=0){
                odd++;
            }
        }
        int sum = 0;
        for (int k:mas){
            sum = sum + k;
        }

        System.out.println();
        System.out.println("Длина массива: "+ mas.length);
        System.out.println("Количество чисел больше 8: "+count_eight);
        System.out.println("Количество чисел равных 1: "+count_one);
        System.out.println("Количество четных чисел: "+even);
        System.out.println("Количество нечетных чисел: "+ odd);
        System.out.println("Сумма всех элементов массива: "+sum);

    }
}
