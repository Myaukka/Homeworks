package ru.myauka.java.basic.homework.lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Создайте классы Cat, Dog и Horse с наследованием от класса Animal.
//        У каждого животного есть имя, скорость бега и плавания(м / с), и выносливость(измеряется в условных единицах)
//        Затраты выносливости:
//        Все животные на 1 метр бега тратят 1 ед выносливости,
//        Собаки на 1 метр плавания -2 ед.
//        Лошади на 1 метр плавания тратят 4 единицы.
//        Кот плавать не умеет.
//        Реализуйте методы run( int distance)и swim ( int distance),которые должны возвращать время, затраченное на
//        указанное действие, и “понижать выносливость”животного.Если выносливости не хватает, то возвращаем
//        время - 1 и указываем что у животного появилось состояние усталости.При выполнении действий пишем
//        сообщения в консоль.
//        Добавьте метод info (), который выводит в консоль состояние животного.

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nВыберите животное:\n1. Кот \n2. Собака\n3. Лошадь\n");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    Cat cat1 = new Cat("Сахар");
                    boolean isWorking = true;
                    while (isWorking) {
                        System.out.println("\nВыберите что делать с животным:\n1. Информация о животном\n" +
                                "2. Заставить пробежать\n3. Заставить проплыть\n0. Вернуться к выбору животного\n");
                        int a = scanner.nextInt();
                        scanner.nextLine();

                        if (a >= 0 && a <= 3) {
                            if (a == 1) {
                                System.out.println("\nИнформация о коте\n");
                                cat1.info();
                            }
                            if (a == 2) {
                                System.out.println("\nВведите дистанцию для бега\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                cat1.run(distance);
                            }
                            if (a == 3) {
                                System.out.println("\nВведите дистанцию для плавания\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                cat1.swim(distance);
                            }
                            if (a == 0) {
                                isWorking = false;
                            }
                        } else {
                            System.out.println("\nВведены некорректные данные, внимательнее блять");
                        }
                    }
                    break;
                case "2":
                    Dog dog1 = new Dog("Чеддер");

                    boolean isWorking1 = true;
                    while (isWorking1) {
                        System.out.println("\nВыберите что делать с животным:\n1. Информация о животном\n" +
                                "2. Заставить пробежать\n3. Заставить проплыть\n0. Вернуться к выбору животного\n");
                        int a = scanner.nextInt();

                        if (a >= 0 && a <= 3) {
                            if (a == 1) {
                                System.out.println("\nИнформация о собаке\n");
                                dog1.info();
                            }
                            if (a == 2) {
                                System.out.println("\nВведите дистанцию для бега\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                dog1.run(distance);
                            }
                            if (a == 3) {
                                System.out.println("\nВведите дистанцию для плавания\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                dog1.swim(distance);
                            }
                            if (a == 0) {
                                isWorking1 = false;
                            }
                        } else {
                            System.out.println("\nВведены некорректные данные, внимательнее блять\n");
                        }
                    }
                    break;
                case "3":
                    Horse horse1 = new Horse("Спирит");
                    boolean isWorking2 = true;
                    while (isWorking2) {
                        System.out.println("\nВыберите что делать с животным:\n1. Информация о животном\n" +
                                "2. Заставить пробежать\n3. Заставить проплыть\n0. Вернуться к выбору животного\n");
                        int a = scanner.nextInt();

                        if (a >= 0 && a <= 3) {
                            if (a == 1) {
                                System.out.println("\nИнформация о лошади\n");
                                horse1.info();
                            }
                            if (a == 2) {
                                System.out.println("\nВведите дистанцию для бега\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                horse1.run(distance);
                            }
                            if (a == 3) {
                                System.out.println("\nВведите дистанцию для плавания\n");
                                int distance = scanner.nextInt();
                                scanner.nextLine();
                                horse1.swim(distance);
                            }
                            if (a == 0) {
                                isWorking2 = false;
                            }
                        } else {
                            System.out.println("\nВведены некорректные данные, внимательнее блять");
                        }
                    }
                    break;
            }
        }
    }
}