package ru.myauka.java.basic.homework.lesson13;

public class ATV implements Transport {
    private final int gas;

    public ATV() {
        this.gas = 50; // метров может проехать
    }

    public boolean ride(int distance, Human human) {
        if (human == null) {
            System.out.println("Машина без водителя не поедет");
            return false;
        } else {
            if (gas >= distance) {
                System.out.println("Вездеход проехал успешно");
                return true;
            }
            System.out.println("Вездеход не проехал, кончился бензин");
            return false;
        }
    }

    @Override
    public String toString() {
        return "вездеход"+ gas + "gas";
    }

}
