package lesson_1;

public class Course {
    private final int power;
    private final int speed;
    private final int intellect;

    public Course(int[] barriers) {
        this.power = barriers[0];
        this.speed = barriers[1];
        this.intellect = barriers[2];
    }

    public void doIt(Team team) {
        lifting(power, team);
        marathon(speed, team);
        logicTask(intellect, team);
    }

    public void lifting(int power, Team team) {
        for (Team t : team.getArray()) {
            if (t.isNext()) {
                if (t.getPower() >= power)
                    System.out.println(t.getClass().getSimpleName() + " прошел 1 испытание. Двигается дальше");
                else {
                    System.out.println(t.getClass().getSimpleName() + " сходит с дистанции");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }

    public void marathon(int speed, Team team) {
        for (Team t : team.getArray()) {
            if (t.isNext()) {
                if (t.getSpeed() >= speed)
                    System.out.println(t.getClass().getSimpleName() + " прошел 2 испытание. Двигается дальше");
                else {
                    System.out.println(t.getClass().getSimpleName() + " сходит с дистанции");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }

    public void logicTask(int intellect, Team team) {
        for (Team t : team.getArray()) {
            if (t.isNext()) {
                if (t.getIntellect() >= intellect)
                    System.out.println(t.getClass().getSimpleName() + " прошел 3 испытание.");
                else {
                    System.out.println(t.getClass().getSimpleName() + " сходит с дистанции");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }
}
