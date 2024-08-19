package ru.myauka.java.basic.homework.lesson12;

public class Plate {

    private final int maxAmount;
    private int currAmount;

    public Plate(int maxAmount) {
        this.maxAmount = maxAmount;
        this.currAmount = maxAmount;
    }

    public void info() {
        System.out.println("\nИнформация о тарелке: " +
                "\nМаксимальное количество еды в тарелке: " + maxAmount +
                "\nТекущее количество еды в тарелке: " + currAmount);
    }

    public void addFood(Food food) {
        while (currAmount < maxAmount && food.getAmountOfFood() > 0) {
            food.setAmountOfFood(food.getAmountOfFood() - 1);
            currAmount++;
        }
    }

    public int getFood() {
        return currAmount;
    }

    public void setCurrAmount(int currAmount) {
        this.currAmount = currAmount;
    }
}