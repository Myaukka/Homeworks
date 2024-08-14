package ru.myauka.java.basic.homework.lesson11;

public class Horse extends Animals {

    public Horse(String name) {
        this.name = name;
        this.speedOfRun = 8; //м/с
        this.coeffOfRun = 1;
        this.speedOfSwim = 1; //м/с
        this.coeffOfSwim = 4;
        this.maxEndurance = 1000;
        this.remainingEndurance = maxEndurance;
    }
}
