package lesson_3.task_2;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> list = new ArrayList<>();
    private float weight;

    public void getWeight(T t) {
                if (t instanceof Apple) {
            weight = ((Apple) t).getCount() * ((Apple) t).getWeight();
        } else if (t instanceof Orange) {
            weight = ((Orange) t).getCount() * ((Orange) t).getWeight();
        }

        System.out.println("Вес коробки с " + t.getClass().getSimpleName() + ": " + weight);
    }

    public void addList(T t) {
        int count;

        if (t instanceof Apple) {
            count = ((Apple) t).getCount();

            while (count != 0) {
                list.add(t);
                count--;
            }
        } else if (t instanceof Orange) {
            count = ((Orange) t).getCount();

            while (count != 0) {
                list.add(t);
                count--;
            }
        }
    }

    public <T> boolean compare(Box<T> box) {
        return this.weight == box.weight;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public <T> void empty(Box<T> box) {
        if (box.list.isEmpty()) {
            box.list = (ArrayList<T>) this.list;
            this.list = new ArrayList<>();
        } else {
            System.out.print("Коробка не пустая. ");
        }
    }
}
