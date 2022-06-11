package Lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int a) {
        if (a <= 500)
            System.out.println("Собака " + super.nameAnimal + " пробежала " + a + " метров");
        else System.out.println("Собака " + super.nameAnimal + " устала. Слишком большая дистанция");
    }

    @Override
    public void swimming(int b) {
        if (b <= 10)
            System.out.println("Собака " + super.nameAnimal + " проплыла " + b + " метров");
        else System.out.println("Собака " + super.nameAnimal + " устала. Слишком большая дистанция");
    }
}
