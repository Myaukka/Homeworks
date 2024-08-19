package ru.myauka.java.basic.homework.lesson12;

public class Food {

    private int amountOfFood;

    public Food(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        if (amountOfFood <= 0) {
            System.out.println("В пакете закончилась еда");
            return 0;
        }
        return amountOfFood;
    }

    public void info() {
        System.out.println("\nКоличество еды в пакете " + amountOfFood);
    }
}