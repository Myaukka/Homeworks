package ru.myauka.java.basic.homework.lesson13;

import static ru.myauka.java.basic.homework.lesson13.Terrain.SWAMP;

public class Bicycle implements Transport {

    public boolean ride(int distance, Human human) {
        if (human == null) {
            System.out.println("Машина без водителя не поедет");
            return false;
        }
        if (human.getTerrain() == SWAMP) {
            System.out.println("Велосипед не может проехать по этой территории");
        } else {
            int energyOfDriver = human.getEnergy();
            if (energyOfDriver >= distance) {
                System.out.println("Велосипед проехал успешно");
                return true;
            }
            System.out.println("Велосипед не проехал, водитель устал");
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "велосипед (тратит силы водителя 1:1)";
    }
}
