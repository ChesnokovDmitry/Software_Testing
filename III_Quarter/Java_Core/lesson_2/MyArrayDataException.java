package lesson_2;

public class MyArrayDataException extends Throwable {
    private final int line;
    private final int column;

    public MyArrayDataException(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public String getMessage() {
        return "Не удалось преобразовать массив. В строке: " + line + " столбце: " + column + " лежит символ или текст";
    }
}
