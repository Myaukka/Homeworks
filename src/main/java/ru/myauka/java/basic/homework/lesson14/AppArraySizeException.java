package ru.myauka.java.basic.homework.lesson14;

public class AppArraySizeException  extends RuntimeException {

    public AppArraySizeException(String message) throws AppArraySizeException{
        super("Некорректный размер массива: " + message);
    }
}
