package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWorkTask8 {
    private static int count = 0;
    private static int current;

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        int value;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(array));
        System.out.println("Введите целое положительное или отрицательное число: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        value = Integer.parseInt(reader.readLine());

        if (value < 0)
            System.out.println(Arrays.toString(arrayShiftLeft(array, value)));
        else if (value > 0)
            System.out.println(Arrays.toString(arrayShiftRight(array, value)));
        else System.out.println(Arrays.toString(array));
    }

    public static int[] arrayShiftLeft(int[] a, int v) {
        while (v != 0) {
            if (count < a.length - 1) {
                current = a[count];
                recursionLeft(a, current);
            } else {
                v++;
                count = 0;
            }
        }

        return a;
    }

    public static int[] arrayShiftRight(int[] a, int v) {
        while (v != 0) {
            if (count < a.length - 1) {
                current = a[a.length - 1 - count];
                recursionRight(a, current);
            } else {
                v--;
                count = 0;
            }
        }

        return a;
    }

    public static void recursionLeft(int[] recArray, int crt) {
        if (count + 1 < recArray.length) {
            recArray[count] = recArray[count + 1];
            recArray[count + 1] = crt;
            count++;
        }
    }

    public static void recursionRight(int[] recArray, int crt) {
        if (count + 1 < recArray.length) {
            recArray[recArray.length - 1 - count] = recArray[recArray.length - 2 - count];
            recArray[recArray.length - 2 - count] = crt;
            count++;
        }
    }
}
