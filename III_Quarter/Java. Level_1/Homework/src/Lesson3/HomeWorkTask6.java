package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkTask6 {
    public static void main(String[] args) {
        int[] array = new int[(int) (Math.random() * 20) + 2];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.print("\nОтсортированный массив: ");

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\nМинимальное значение: " + array[0]);
        System.out.println("Максимальное значение: " + array[array.length - 1]);
    }
}
