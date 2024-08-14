package ru.myauka.java.basic.homework.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //                            РАБОТА С СПОЛЬЗОВАТЕЛЯМИ
//        Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
//        Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
//        В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//        ФИО: фамилия имя отчество
//        Год рождения: год рождения
//        e-mail: email
//        В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
//        выведите информацию только о пользователях старше 40 лет.

        User[] users = {
                new User("Владимир", "Владимирович", "Путин",
                        1965, "putinkrasava@mail.ru"),
                new User("Иван", "Романович", "Харитонов",
                        2000, "hara2000@mail.ru"),
                new User("Александр", "Станиславович", "Жуковский",
                        1974, "zhukovskiyas@mail.ru"),
                new User("Дмитрий", "Андреевич", "Павлюченко",
                        2001, "koltsifer@gmail.com"),
                new User("Эдуард", "Евгеньевич", "Блумберг",
                        1998, "mushroomelfs1488@mail.ru"),
                new User("Никита", "Андреевич", "Сычев",
                        1994, "machinevision@mail.ru"),
                new User("Юлия", "Сергеевна", "Ульянова",
                        1963, "Ulyanova63@mail.ru"),
                new User("Светлана", "Владимировна", "Сурова",
                        1966, "bekaonelove@mail.ru"),
                new User("Мизулина", "Екатерина", "Владимировна",
                        1984, "pizdulina@mail.ru"),
                new User("Артемий", "Ольгович", "Лебедев",
                        1979, "artemiylebedev@mail.ru")
        };
//                                       РАБОТА С КОРОБКОЙ

//        Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку
//        можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
//        У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
//        (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии
//        что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться выводом
//        сообщений в консоль.

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите задание:\n1. Работа с пользователями\n2. Работа с коробками");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    findUsers(users);
                    break;
                case "2":
                    Box box1 = new Box("красный", 6, null);

                    while (true) {
                        System.out.println("\nВыберите что делать с коробкой: \n1. Показать информацию о коробке " +
                                "\n2. Изменить цвет коробки\n3. Открыть коробку\n4. Закрыть коробку" +
                                "\n5. Положить в коробку предмет\n6. Убрать предмет из коробки");
                        int a = scanner.nextInt();
                        scanner.nextLine();

                        if (a >= 1 && a <= 6) {
                            if (a == 1) {
                                box1.info();
                            }
                            if (a == 2) {
                                System.out.println("Ведите новый цвет");
                                String color = scanner.nextLine();
                                box1.setColor(color);
                            }
                            if (a == 3) {
                                box1.setOpen(true);

                            }
                            if (a == 4) {
                                box1.setOpen(false);
//                    box1.open(); Дима сделал
//                    box1.close();
                            }
                            if (a == 5) {
                                box1.setItem();
                            }
                            if (a == 6) {
                                box1.deleteItem();
                            }
                        } else {
                            System.out.println("Введены некорректные данные, внимательнее блять");
                        }
                    }
                default:
                    System.out.println("Введены некорректные данные, внимательнее блять");
                    break;
            }
        }
    }

    public static void findUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].ageOfUser() > 40)
                users[i].info();
        }
    }
}