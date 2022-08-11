package lesson_4;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook(new HashMap<>());

        phonebook.getFamily().put(98754876585L, "Гаврилов");
        phonebook.getFamily().put(98754876584L, "Иванов");

        for (Map.Entry<Long, String> map : phonebook.getFamily().entrySet()) {
            if (map.getValue().equals("Иванов"))
                System.out.println(map.getValue() + " " + map.getKey());
        }
    }
}
