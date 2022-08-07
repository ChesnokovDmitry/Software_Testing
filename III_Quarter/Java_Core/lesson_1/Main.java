package lesson_1;

import lesson_1.team.Jack;
import lesson_1.team.Karl;
import lesson_1.team.Tom;
import lesson_1.team.Victor;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Avengers", new Team[] {
                new Jack(6, 8, 9),
                new Tom(10, 8, 2),
                new Karl(7,10,5),
                new Victor(8,8,7)});
        Course course = new Course(new int[] {7, 6, 7});

        team.memberOfTheTeam();
        course.doIt(team);
        team.showResults();
    }
}
