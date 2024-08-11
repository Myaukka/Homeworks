package ru.myauka.java.basic.homework.lesson3;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nДля начала работы введите номер задания которое хотите посмотреть:\n1 - greetings" +
                    "\n2 - checkSign\n3 - selectColor\n4 - compareNumbers\n5 - addOrSubtractAndPrint\n" +
                    "6 - лучшая в мире микропиздочная игра");
            int a = scanner.nextInt();

            if (a >= 1 && a <= 6) {
                if (a == 1) {
                    greetings();
                }
                if (a == 2) {
                    checkSign();
                }
                if (a == 3) {
                    selectColor();
                }
                if (a == 4) {
                    compareNumbers();
                }
                if (a == 5) {
                    addOrSubtractAndPrint();
                }
                if (a == 6) {
                    goodestGameInTheWorld();
                }
            } else {
                System.out.println("Тебе сказали по русски че ввести, не выебывайся давай");
            }
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число a");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        System.out.println("Введите целое число c");
        int c = scanner.nextInt();
        int n = a + b + c;

        if (n >= 0) {
            System.out.println("Сумма a + b + c = " + n + " - положительная");
        } else {
            System.out.println("Сумма " + n + " отрицательная");
        }
    }

    public static void selectColor() {

        int data = (int) (Math.random() * 100);
        System.out.println("Псевдослучайное число " + "= " + data);

        if (data >= 0 && data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число a");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Число а - " + a + " >= " + "числу b - " + b);
        } else {
            System.out.println("Число а - " + a + " < " + "числа b - " + b);
        }
    }

    public static void addOrSubtractAndPrint() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите введите любое число кроме 0, если вы панк");
        int punk = scanner.nextInt();
        int a = 100;
        int delta = (a - punk);
        boolean trushnost = (punk == 0);
        {

            if (trushnost) {
                int t = (a - delta);
                System.out.println(t + " - твой IQ потому что ты и правда панк((((");
            }
            if (!trushnost) {
                int f = a + delta;
                System.out.println(f + " - колличество твоих гей партнеров");
            }
        }
    }

    public static void goodestGameInTheWorld() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Готов сыграть в лучшую в мире игру?");
        System.out.println("Введи 0, если да");

        if (scanner.nextInt() == 0) {
            System.out.println("Введи число от 1 до 5");
        } else {
            System.out.println("Ну и соси тогда");
            return;
        }
        if (scanner.nextInt() == 1) {
            System.out.println("Переходи к числу 2");
        } else {
            System.out.println("Ты проиграл(");
            return;
        }

        if (scanner.nextInt() == 2) {
            System.out.println("Переходи к числу 3");
        } else {
            System.out.println("Ты проиграл(");
            return;
        }
        if (scanner.nextInt() == 3) {
            System.out.println("Переходи к числу 4");
        } else {
            System.out.println("Ты проиграл(");
            return;
        }
        if (scanner.nextInt() == 4) {
            System.out.println("Переходи к числу 5");
        } else {
            System.out.println("Ты проиграл(");
            return;
        }
        if (scanner.nextInt() == 5) {
            System.out.println("Спасибо, что потратил свое время на лучшую в мире микропиздочную игру, ты сладкий пирожочек, чмоки <3");
        } else {
            System.out.println("Ты был так близок, но все просрал))))");
        }
    }
}