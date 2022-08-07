package lesson_2;

public class MyArraySizeException extends Throwable {
    public String getMessage() {
        return "Не правильный размер массива";
    }
}
