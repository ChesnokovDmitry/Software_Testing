package lesson_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            AppData appData = new AppData(new String[]{"id", "phoneNumber", "age"},
                    new int[][]{{1, 65445, 2},
                            {2, 54578, 3},
                            {3, 48752, 1},
                            {4, 78123, 4}});

            appData.addition(new int[][]{{5, 65944, 7},{6,11122, 8}});
            appData.getWriter().close();

            /*AppData appData1 = new AppData(new String[]{"age", "phoneNumber", "id"},
                    new int[][]{{10, 65445, 20},
                            {20, 54578, 30}});
            appData1.getWriter().close();*/

        } catch (IOException e) {
            System.out.println("Трям");
        }
    }
}
