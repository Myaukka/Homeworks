package ru.myauka.java.basic.homework.lesson11;

import java.util.Scanner;

public abstract class Animals {

    String name;
    int speedOfRun; //runSpeed
    int coeffOfRun; //runCoeff
    int speedOfSwim; //swimSpeed
    int coeffOfSwim; //swimCoeff
    int maxEndurance;
    int remainingEndurance; //currEndurance

    Scanner scanner = new Scanner(System.in);

    public void info() {
        System.out.println("Имя: " + name +
                "\nСкорость бега: " + speedOfRun + "м/с" +
                "\nСкорость плавания: " + speedOfSwim + "м/с" +
                "\nВыносливость: " + maxEndurance +
                "\nОставшаяся выносливость: " + remainingEndurance);
    }

    public int run(int distance) {
        //исключить возможность введения отрицательных значений
        if (remainingEndurance >= distance * coeffOfRun) {
            System.out.println("\nЖивотное пробежало " + distance + " метров за " + ((distance / speedOfRun))
                    + " секунд");
            remainingEndurance -= distance * coeffOfRun;
            return distance / speedOfRun;
        } else {
            System.out.println("\nЖивотное устало");
            return -1;
        }
    }

    public int swim(int distance) {
        //исключить возможность введения отрицательных значений
//        if (remainingEndurance < 1){
//            System.out.println("Животное не побежит на такое расстояние.");
//            return -1;
//        }
        if (remainingEndurance >= distance * coeffOfSwim) {
            System.out.println("\nЖивотное проплыло " + distance + " метров за " + ((distance / speedOfSwim))
                    + " секунд");
            remainingEndurance -= distance * coeffOfSwim;
            return distance / speedOfSwim;
        } else {
            System.out.println("\nЖивотное устало");
            return -1;
        }
    }
}
