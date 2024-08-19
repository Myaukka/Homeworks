package ru.myauka.java.basic.homework.lesson13;

import static ru.myauka.java.basic.homework.lesson13.Terrain.*;

public class Car implements Transport {

    private final int gas;

    public Car() {
        this.gas = 70; // метров может проехать
    }

    public boolean ride(int distance, Human human) {
        if (human == null) {
            System.out.println("Машина без водителя не поедет");
            return false;
        }
        if (human.getTerrain() == DENSE_FOREST || human.getTerrain() == SWAMP) {
            System.out.println("Машина не может проехать по этой территории");
        } else {
            if (gas >= distance) {
                System.out.println("Машина проехала успешно");
                return true;
            }
            System.out.println("Машина не проехала, кончился бензин");
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "машина " + gas + " gas";
    }
}
