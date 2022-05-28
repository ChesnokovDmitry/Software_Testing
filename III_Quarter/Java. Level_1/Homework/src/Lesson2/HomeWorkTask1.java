package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        String value1, value2;

        while (true) {
            System.out.println("Введите первое число или 'exit' для выхода: ");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            value1 = bufferedReader.readLine();

            if (value1.equals("exit"))
                break;

            System.out.println("Введите второе число или 'exit' для выхода: ");
            value2 = bufferedReader.readLine();

            if (value2.equals("exit"))
                break;

            System.out.println("Сумма чисел лежит в пределах от 10 до 20 включительно?" +
                    "\n" + sumOfNumbers(Integer.parseInt(value1), Integer.parseInt(value2)));
        }
    }

    public static boolean sumOfNumbers(int num1, int num2) {
        int sum = num1 + num2;

        return sum >= 10 && sum <= 20;
    }
}
