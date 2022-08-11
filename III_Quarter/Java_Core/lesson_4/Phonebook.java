package lesson_4;

import java.util.HashMap;

public class Phonebook {
    private final HashMap<Long, String> family;

    public Phonebook(HashMap<Long, String> family) {
        this.family = family;
        this.family.put(89654588785L, "Зюзин");
        this.family.put(89654585685L, "Иванов");
        this.family.put(89654588723L, "Петров");
        this.family.put(85894585685L, "Машков");
        this.family.put(89874563214L, "Капустин");
        this.family.put(89654585871L, "Иванов");
        this.family.put(89654588755L, "Семин");
        this.family.put(88654585685L, "Иванов");
        this.family.put(89654566785L, "Зюзин");
        this.family.put(89654585185L, "Иванова");
    }

    public HashMap<Long, String> getFamily() {
        return family;
    }
}
