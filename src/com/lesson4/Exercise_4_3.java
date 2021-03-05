/**3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
        В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
        Пример сгенерированной матрицы (для простоты m=3, n=5):

        3 2 1 5 7 	// сумма - 18
        1 2 5 6 2 	// сумма - 16
        3 4 9 6 4	// сумма - 26

        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)*/
package com.lesson4;
import java.util.Random;
import java.util.Arrays;

public class Exercise_4_3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int var_summ_string = 0;
        int summ_string = 0;
        int maxSumId = 0;

        int[][] massive = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                massive[i][j] = rand.nextInt(50);
                System.out.print(massive[i][j] + " ");
                var_summ_string += massive[i][j];
            }

            System.out.print(" = " + var_summ_string);
            if (var_summ_string >= summ_string) {
                    summ_string = var_summ_string;
                    maxSumId = i;
                }

            var_summ_string = 0;
            System.out.println();

        }
        System.out.println(summ_string);
        System.out.println(maxSumId);

    }
}