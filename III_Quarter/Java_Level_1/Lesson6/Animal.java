package Lesson6;

public class Animal {
    protected String nameAnimal;
    private int dogCount = 0;
    private int catCount = 0;

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public Animal() {

    }

    public void run(int a) {
        System.out.println(nameAnimal + " бежит");
    }

    public void swimming(int b) {
        System.out.println(nameAnimal + "плывет");
    }

    public void count(Animal animal) {
        if (animal instanceof Cat) {
            catCount++;
        } else if (animal instanceof  Dog) {
            dogCount++;
        }
    }

    public int getDogCount() {
        return dogCount;
    }

    public int getCatCount() {
        return catCount;
    }
}
