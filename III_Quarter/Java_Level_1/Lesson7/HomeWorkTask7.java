package Lesson7;

import java.util.ArrayList;

public class HomeWorkTask7 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 11, false));
        cats.add(new Cat("Vaska", 2, false));
        cats.add(new Cat("Mursik", 35, false));
        cats.add(new Cat("Kotik", 100, false));
        cats.add(new Cat("Usik", 17, false));
        Plate plate = new Plate(30);

        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
    }
}