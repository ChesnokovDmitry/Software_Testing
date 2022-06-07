package Lesson6;

public class HomeWorkLesson6 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat1 = new Cat("Бариска");
        animal.count(cat1);

        Animal dog1 = new Dog("Чижик");
        animal.count(dog1);

        Animal cat2 = new Cat("Мяут");
        animal.count(cat2);

        Animal dog2 = new Dog("Пыжик");
        animal.count(dog2);

        Animal cat3 = new Cat("Кот");
        animal.count(cat3);

        cat1.run(120);
        cat1.swimming(3);
        dog1.run(300);
        dog1.swimming(9);
        cat2.run(220);
        cat2.swimming(1);
        dog2.run(550);
        dog2.swimming(11);
        cat3.run(10);
        cat3.swimming(20);

        System.out.println("Создано " + animal.getCatCount() + " котов");
        System.out.println("Создано " + animal.getDogCount() + " собак");
    }
}
