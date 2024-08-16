package ru.myauka.java.basic.homework.lesson12;

public class Plate {

    private int maxAmount;
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

    public int addFood(Food food) {
        if(currAmount < maxAmount) {
            food.setAmountFood(food.putFood() - (maxAmount - currAmount));
            while (currAmount < maxAmount) {
                currAmount ++;
            }
        }return currAmount;
    }
    public int getFood() {
        return currAmount;
    }

    public void setCurrAmount(int currAmount) {
        this.currAmount = currAmount;
    }
}
