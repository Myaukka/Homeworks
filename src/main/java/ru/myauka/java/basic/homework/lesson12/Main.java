package ru.myauka.java.basic.homework.lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      * Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды) и Кот (имя, аппетит).
//        Количество еды измеряем в условных единицах.
//      * При создании тарелки указывается ее объем и она полностью заполняется едой
//      * В тарелке должен быть метод, позволяющий добавить еду в тарелку. После добавления в тарелке не может оказаться
//        еды больше максимума
//      * В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения, в тарелке
//        не может оказаться отрицательное количество еды (если удалось уменьшить еду так, чтобы в тарелке осталось >= 0
//        кусков еды, то возвращаем true, в противном случае - false).
//      * Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
//        (хватило еды), сытость = true.
//      * Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//        наполовину сыт (это сделано для упрощения логики программы).
//      * Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
//        информацию о сытости котов в консоль.

        Cat[] cats = {
                new Cat("Сахар", "Белый", 4, 15),
                new Cat("Джейк", "Черный", 2, 20),
                new Cat("Пушок", "Рыжий", 5, 25),
                new Cat("Батон", "Серый", 7, 18)
        };
        Plate plate = new Plate(70);
        Food food = new Food(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие: " +
                    "\n1. Показать информацию о котах" +
                    "\n2. Показать информацию о тарелке " +
                    "\n3. Показать информацию о пакете с едой" +
                    "\n4. Покормить котов" +
                    "\n5. Добавить еду в тарелку" +
                    "\n6. Поиграть со всеми котами" +
                    "\n7. Поиграть с конкретным котом" +
                    "\n8. Покормить конкретного кота");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("\nИнформация о котах: ");
                    for (int i = 0; i < cats.length; i++) {
                        cats[i].info();
                    }
                    break;
                case "2":
                    plate.info();
                    break;
                case "3":
                    food.info();
                    break;
                case "4":
                    for (int i = 0; i < cats.length; i++) {
                        cats[i].feed(plate);
                    }
                    break;
                case "5":
                    plate.addFood(food);
                    break;
                case "6":
                    for (int i = 0; i < cats.length; i++) {
                        cats[i].playWithCat();
                    }
                    break;
                case "7":
                    boolean isWorking = true;
                    while (isWorking) {
                        System.out.println("\nВыберите кота с которым поиграть: " +
                                "\n1. Сахар" +
                                "\n2. Джейк" +
                                "\n3. Пушок" +
                                "\n4. Батон" +
                                "\n0. Вернуться к прошлым действиям");
                        int a = scanner.nextInt();
                        scanner.nextLine();

                        if (a >= 0 && a <= 4) {
                            if (a == 1) {
                                cats[0].playWithCat();
                                isWorking = false;
                            }
                            if (a == 2) {
                                cats[1].playWithCat();
                                isWorking = false;
                            }
                            if (a == 3) {
                                cats[2].playWithCat();
                                isWorking = false;
                            }
                            if (a == 4) {
                                cats[3].playWithCat();
                                isWorking = false;
                            }
                            if (a == 0) {
                                isWorking = false;
                            }
                        } else {
                            System.out.println("Введены некорректные данные, внимательнее блять");
                        }
                    }
                    break;
                case "8":
                    boolean isWorking2 = true;
                    while (isWorking2) {
                        System.out.println("\nВыберите кота которого хотите покормить: " +
                                "\n1. Сахар" +
                                "\n2. Джейк" +
                                "\n3. Пушок" +
                                "\n4. Батон" +
                                "\n0. Вернуться к прошлым действиям");
                        int a = scanner.nextInt();
                        scanner.nextLine();

                        if (a >= 0 && a <= 4) {
                            if (a == 1) {
                                cats[0].feed(plate);
                                isWorking2 = false;
                            }
                            if (a == 2) {
                                cats[1].feed(plate);
                                isWorking2 = false;
                            }
                            if (a == 3) {
                                cats[2].feed(plate);
                                isWorking2 = false;
                            }
                            if (a == 4) {
                                cats[3].feed(plate);
                                isWorking2 = false;
                            }
                            if (a == 0) {
                                isWorking2 = false;
                            }
                        } else {
                            System.out.println("Введены некорректные данные, внимательнее блять");
                        }
                    }
                    break;
                default:
                    System.out.println("Введены некорректные данные, внимательнее ");
                    break;
            }
        }
    }
}