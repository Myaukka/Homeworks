package ru.myauka.java.basic.homework.lesson11;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
        this.speedOfRun = 2; // м/с
        this.coeffOfRun = 1;
        this.maxEndurance = 200;
        this.remainingEndurance = maxEndurance;
    }
    @Override
    public int swim(int distance) {
        System.out.println("\nКот не умеет плавать");
        return -1;
    }
}
