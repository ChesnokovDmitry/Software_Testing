package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean s) {
        while (n > food) {
            System.out.println("В миске мало еды. Котик не наелся: " + s);
            addFood(n);
        }

        food -= n;
        s = true;
        System.out.println("Котик наелся: " + s);
    }

    public void addFood(int n) {
        int supplement = n - food;
        food += supplement;
        System.out.println("В миску добавили " + food + " еды");
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}