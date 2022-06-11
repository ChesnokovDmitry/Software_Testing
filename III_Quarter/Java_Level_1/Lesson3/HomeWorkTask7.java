package Lesson3;

import java.util.Random;

public class HomeWorkTask7 {
    private static int rightValue;
    private static int leftValue;
    private static int rInc;
    private static int lInc;

    public static void main(String[] args) {
        int[] array = new int[(int) (Math.random() * 10) + 3];
        boolean result;

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        result = checkBalance(array);

        if (result) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if (i == lInc - 1) System.out.print(". ");
            }

            System.out.println();
        }

        System.out.println(result);
    }

    /*public static void main(String[] args) {
        int[] array = {5, 1, 1, 0, 2, 5};               //true
        //int[] array = {6, 3, 0, 1, 6, 1, 9, 6, 0};    //true
        //int[] array = {0, 0, 6, 7, 2, 2, 7, 4, 6, 7};   //false
        //int[] array = {0, 0, 6, 7, 2, 2, 0, 4, 6, 7};   //true
        //int[] array = {8, 4, 3, 3, 2, 4, 0};            //true
        boolean result;

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
        result = checkBalance(array);

        if (result) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if (i == lInc - 1) System.out.print(". ");
            }

            System.out.println();
        }

        System.out.println(result);
    }*/

    public static boolean checkBalance(int[] arr) {
        rightValue = arr[arr.length - 1];;
        leftValue = arr[0];
        rInc = 1;
        lInc = 1;

        while (rInc + lInc < arr.length) {
            if (rightValue < leftValue) {
                rightValue += arr[arr.length - 1 - rInc];
                rInc++;
            } else if (rightValue > leftValue) {
                leftValue += arr[lInc];
                lInc++;
            } else {
                if (lInc == arr.length - 1 - rInc && arr[lInc] == 0) {
                    break;
                } else if (lInc == arr.length - 1 - rInc && arr[lInc] != 0) {
                    leftValue += arr[lInc];
                    break;
                } else {
                    rightValue += arr[arr.length - 1 - rInc];
                    leftValue += arr[lInc];
                    rInc++;
                    lInc++;
                }
            }
        }

        return rightValue == leftValue;
    }
}