package Lesson5;

public class Person {
    private final String name;
    private final String employment;
    private final String email;
    private final String phoneNumber;
    private final int money;
    private final int age;

    public Person(String name, String employment, String email, String phoneNumber, int money, int age) {
        this.name = name;
        this.employment = employment;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmployment() {
        return employment;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", employment='" + employment + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }
}
