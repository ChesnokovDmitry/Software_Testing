package lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String word;

        System.out.println("Введите набор слов (до 20 или введите 'end', чтобы выйти). " +
                "Должны встречаться повторяющиеся слова:");

        while (count != 20) {
            word = reader.readLine();

            if (word.equals("end"))
                break;

            list.add(word);
            count++;
        }

        System.out.println("Исходный массив: " + list);

        set.addAll(list);
        System.out.println("Уникальный массив: " + set);

        for (String strSet : set) {
            count = 0;

            for (String strList : list) {
                if (strSet.equals(strList))
                    count++;
            }

            if (count > 1)
                System.out.println("Слово " + strSet + " встречается " + count + " раз.");
        }
    }
}
