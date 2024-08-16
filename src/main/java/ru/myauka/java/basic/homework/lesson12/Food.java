package ru.myauka.java.basic.homework.lesson12;

public class Food {

   private int amountFood;

   public Food(int amount) {
      this.amountFood = amount;
   }

   public void setAmountFood(int amountFood) {
      this.amountFood = amountFood;
   }

   public int putFood() {
      return amountFood;
   }

   public void info() {
      System.out.println("\nКоличество еды в пакете " + amountFood);
   }
}
