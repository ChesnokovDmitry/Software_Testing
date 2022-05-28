package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        String value1, value2;

        while (true) {
            System.out.println("Введите первое значение: ");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            value1 = bufferedReader.readLine();
            System.out.println("Введите число или 'exit' для выхода: ");
            value2 = bufferedReader.readLine();

            if (value2.equals("exit"))
                break;

            printString(value1, Integer.parseInt(value2));
        }
    }

    public static void printString(String s, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + ". " + s);
        }
    }
}
