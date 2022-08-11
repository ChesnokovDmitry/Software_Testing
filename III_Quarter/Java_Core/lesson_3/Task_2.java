package lesson_3;

import lesson_3.task_2.Apple;
import lesson_3.task_2.Box;
import lesson_3.task_2.Fruit;
import lesson_3.task_2.Orange;

public class Task_2 {
    public static void main(String[] args) {
        Apple apple = new Apple(10);
        Orange orange = new Orange(5);
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> temporaryFruitBox = new Box<>();

        appleBox.addList(apple);
        orangeBox.addList(orange);

        System.out.print("Содержимое appleBox: ");
        for (Fruit f : appleBox.getList())
            System.out.print(f.getClass().getSimpleName() + " ");
        System.out.println();

        System.out.print("Содержимое orangeBox: ");
        for (Fruit f : orangeBox.getList())
            System.out.print(f.getClass().getSimpleName() + " ");
        System.out.println();

        appleBox.getWeight(apple);
        orangeBox.getWeight(orange);

        System.out.println(appleBox.compare(orangeBox));

        System.out.println("\nПерекладываем содержимое из appleBox в temporaryFruitBox");
        appleBox.empty(temporaryFruitBox);
        System.out.print("Содержимое temporaryFruitBox: ");
        for (Fruit f : temporaryFruitBox.getList())
            System.out.print(f.getClass().getSimpleName() + " ");
        if (appleBox.getList().isEmpty())
            System.out.println("\nКоробка appleBox пустая");

        System.out.println("\nПерекладываем содержимое из temporaryFruitBox в orangeBox");
        appleBox.empty(orangeBox);
        System.out.print("Содержимое orangeBox: ");
        for (Fruit f : orangeBox.getList())
            System.out.print(f.getClass().getSimpleName() + " ");
        if (temporaryFruitBox.getList().isEmpty())
            System.out.println("\nКоробка temporaryFruitBox пустая");

        System.out.println("\n\nПерекладываем содержимое из orangeBox в appleBox");
        orangeBox.empty(appleBox);
        System.out.print("Содержимое appleBox: ");
        for (Fruit f : appleBox.getList())
            System.out.print(f.getClass().getSimpleName() + " ");
        if (orangeBox.getList().isEmpty())
            System.out.println("\nКоробка orangeBox пустая");
    }
}
