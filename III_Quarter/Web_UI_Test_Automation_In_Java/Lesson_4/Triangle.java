package org.example;

public class Triangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;

        System.out.println(areaOfATriangle(a, b, c));
    }

    public static double areaOfATriangle(int a, int b, int c) throws ArithmeticException, IllegalArgumentException {
        double p;

        if (isNull(a, b, c))
            throw new ArithmeticException();
        else if (isNegativeNumber(a, b, c) || isSumOfSides(a, b, c))
            throw new IllegalArgumentException();
        else
            p = (double) (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static boolean isNull(int a, int b, int c) {
        return a == 0 || b == 0 || c == 0;
    }

    static boolean isNegativeNumber(int a, int b, int c) {
        return a < 0 || b < 0 || c < 0;
    }

    static boolean isSumOfSides(int a, int b, int c) {
        return (a + b) < c || (a + c) < b || (b + c) < a;
    }
}