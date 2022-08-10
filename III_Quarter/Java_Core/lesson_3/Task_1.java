package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        String[] array = new String[] {"string_1", "string_2", "string_3", "string_4", "string_5"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oneElementArray, twoElementArray;
        String temporaryVariable;

        System.out.println(Arrays.toString(array));
        System.out.println("Выберите 2 элемента массива, чтобы поменять их местами." +
                "Введите число от 1 до " + array.length);
        System.out.println("Элемент 1: ");

        while (true) {
            oneElementArray = Integer.parseInt(reader.readLine());

            if (oneElementArray > array.length || oneElementArray <= 0)
                System.out.println("Число не соответствует условию. " +
                        "Введите число больше 0, но меньше " + array.length);
            else break;
        }

        System.out.println("Элемент 2: ");

        while (true) {
            twoElementArray = Integer.parseInt(reader.readLine());

            if (twoElementArray > array.length || twoElementArray <= 0)
                System.out.println("Число не соответствует условию. " +
                        "Введите число больше 0, но меньше " + array.length);
            else break;
        }

        temporaryVariable = array[oneElementArray - 1];
        array[oneElementArray - 1] = array[twoElementArray - 1];
        array[twoElementArray - 1] = temporaryVariable;
        System.out.println(Arrays.toString(array));
    }
}
