package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        String str;

        while (true) {
            System.out.println("Введите целое число или 'exit' для выхода: ");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();

            if (str.equals("exit"))
                break;

            System.out.println(symbolCheck(Integer.parseInt(str)));
        }
    }

    public static boolean symbolCheck(int num) {

        return num < 0;
    }
}
