package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        String str;

        while (true) {
            System.out.println("Введите год или 'exit' для выхода: ");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();

            if (str.equals("exit"))
                break;

            System.out.println(leapYear(Integer.parseInt(str)));
        }
    }

    public static boolean leapYear(int year) {

        return (year % 4 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 && year % 400 != 0);
    }
}
