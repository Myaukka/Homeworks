package ru.myauka.java.basic.homework.lesson11;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;
        this.speedOfRun = 4; //м/с
        this.coeffOfRun = 1;
        this.speedOfSwim = 2; //м/с
        this.coeffOfSwim = 2;
        this.maxEndurance = 500;
        this.remainingEndurance = maxEndurance;
    }

}
