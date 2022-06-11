package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWorkTask5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива: ");
        int len = Integer.parseInt(reader.readLine());
        System.out.println("Введите целое число: ");
        int initialValue = Integer.parseInt(reader.readLine());

        int[] array = initArray(len, initialValue);

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    public static int[] initArray(int l, int iV) {
        int[] array = new int[l];
        Arrays.fill(array, iV);

        return array;
    }
}
