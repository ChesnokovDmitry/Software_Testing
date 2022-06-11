package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader readerLength, readerArray;
        int[] array, invertedArray;
        int a, count;

        readerLength = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива (целое положительное число): ");
        array = new int[Integer.parseInt(readerLength.readLine())];
        invertedArray = new int[array.length];
        count = 0;
        System.out.println("Заполните массив. Введите '0' или '1': ");

        do {
            while (true) {
                readerArray = new BufferedReader(new InputStreamReader(System.in));
                a = Integer.parseInt(readerArray.readLine());

                if (a == 0 || a == 1) break;
                else System.out.println("Пожалуйста, введите '0' или '1': ");
            }

            array[count] = a;
            count++;
        } while (count < array.length);

        for (int j : array) {
            System.out.print(j);
        }

        System.out.println();

        for (int i = 0; i < invertedArray.length; i++) {
            if (array[i] == 0)
                invertedArray[i] = 1;
            else
                invertedArray[i] = 0;
        }

        for (int j : invertedArray) {
            System.out.print(j);
        }

        System.out.println();
    }
}
