package lesson_1.team;

import lesson_1.Team;

public class Tom extends Team {
    private boolean next;

    public Tom(int power, int speed, int intellect) {
        super(power, speed, intellect);
        this.next = super.isNext();
    }

    @Override
    public String toString() {
        return "Tom{" +
                "power=" + super.getPower() +
                ", speed=" + super.getSpeed() +
                ", intellect=" + super.getIntellect() +
                '}';
    }

    public int getPower() {
        return super.getPower();
    }

    public int getSpeed() {
        return super.getSpeed();
    }

    public int getIntellect() {
        return super.getIntellect();
    }

    @Override
    public boolean isNext() {
        return next;
    }

    @Override
    public void setNext(boolean next) {
        this.next = next;
    }
}
