package ru.myauka.java.basic.homework.lesson13;

import static ru.myauka.java.basic.homework.lesson13.Terrain.SWAMP;

public class Horse implements Transport {

    private final int horseEnergy;

    public Horse() {
        this.horseEnergy = 100; // метров может проехать
    }

    public boolean ride(int distance, Human human) {
        if (human == null) {
            System.out.println("Машина без водителя не поедет");
            return false;
        }
        if (human.getTerrain() == SWAMP) {
            System.out.println("Лошадь не может проехать по этой территории");
        } else {
            if (horseEnergy >= distance) {
                System.out.println("Лошадь преодолела расстояние успешно");
                return true;
            }
            System.out.println("Лошадь не преодолела расстояние, устала");
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "лошадь " + horseEnergy + " horse energy";
    }
}
