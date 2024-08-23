package ru.myauka.java.basic.homework.lesson14;

public class AppArrayDataException extends RuntimeException {

    public AppArrayDataException(String message) throws AppArrayDataException {
        super("Некорректные данные массива: " + message);
    }

    public AppArrayDataException(int a, int b) throws AppArrayDataException {
        super("Значение не может быть преобразовано в число с индексом: [" + a + "][" + b + "]");
    }
}