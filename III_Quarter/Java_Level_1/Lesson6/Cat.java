package Lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int a) {
        if (a <= 200)
            System.out.println("Кот " + super.nameAnimal + " пробежал " + a + " метров");
        else System.out.println("Кот " + super.nameAnimal + " устал. Слишком большая дистанция");
    }

    @Override
    public void swimming(int b) {
        System.out.println("Кот " + super.nameAnimal + " не умеет плавать");
    }
}
