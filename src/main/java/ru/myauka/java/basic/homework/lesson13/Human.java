package ru.myauka.java.basic.homework.lesson13;

public class Human {

    private Terrain terrain;
    private final String name;
    private Transport currentTransport;
    private final int energy;

    public Human(String name, int energy) {
        this.name = name;
        this.currentTransport = null;
        this.energy = energy; //сколько может пройти пешком или проехать на велосипеде
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public boolean isUsingTransport() {
        if (currentTransport == null) {
            System.out.println("Человек не использует транспорт");
            return false;
        }
        System.out.println("Человек использует транспорт: " + currentTransport);
        return true;
    }

    public boolean walk(int distance) {
        if (energy >= distance) {
            System.out.println("Человек прошел успешно");
            return true;
        }
        System.out.println("Человек не прошел потому что устал");
        return false;
    }

    public boolean move(int distance, Human human) {

        if (isUsingTransport()) {
            currentTransport.ride(distance, human);
            return true;
        } else {
            walk(distance);
            return false;
        }
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;

    }

    public int getEnergy() {
        return energy;
    }

    public void outOfTransport() {
        if (currentTransport != null) {
            currentTransport = null;
            System.out.println("Человек покинул транспорт");
        } else {
            System.out.println("Человек итак не использует транспорт");
        }
    }

    @Override
    public String toString() {
        return name + " {" +
                "currentTransport=" + currentTransport +
                '}';
    }
}
