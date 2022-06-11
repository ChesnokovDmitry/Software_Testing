package Lesson5;

import java.util.ArrayList;

public class HomeWorkLesson5 {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alexandrov Alexandr", "Engineer", "alex1992@gmail.com",
                "89664552121", 50000, 29));
        personList.add(new Person("Valetov Andrey", "QA Engineer", "andron28@gmail.com",
                "89458136547", 75000, 25));
        personList.add(new Person("Belmondo Kirill", "Hr", "belka@yandex.ru",
                "89574263518", 65000, 41));
        personList.add(new Person("Homyak Viktoria", "Programmer", "viki93@gmail.com",
                "89788546525", 750000, 19));
        personList.add(new Person("Moskvina Maria", "Manual Testing Enngineer", "mosma@ya.ru",
                "89578564789", 80000, 42));

        for (Person person : personList) {
            if (person.getAge() > 40)
                System.out.println(person);
        }
    }
}