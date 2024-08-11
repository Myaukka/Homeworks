package ru.myauka.java.basic.homework.lesson7;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{1, -2, 3, -4, 5}, {-1, 2, -3, 4, 5}};

        while (true) {
            System.out.println("\nДля начала работы введите номер задания которое хотите посмотреть:" +
                    "\n1 - sumOfPositiveElements" +
                    "\n2 - squareOfArray\n3 - zeroingDiagonals\n4 - findMax\n5 - sumOfSecondString\n");
            int a = scanner.nextInt();

            if (a >= 1 && a <= 6) {
                if (a == 1) {
                    printArr(arr);
                    sumOfPositiveElements(arr);
                }
                if (a == 2) {
                    System.out.println("Введите число стороны квадратного массива");
                    squareOfArray(scanner.nextInt());
                }
                if (a == 3) {
                    int[][] arr1 = new int[7][7];
                    zeroingDiagonals(arr1);
                }
                if (a == 4) {
                    System.out.println("Входящий двумерный массив:");
                    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
                    printArr(array);
                    findMax(array);
                }
                if (a == 5) {
                    sumOfSecondString();
                    //System.out.println("Самое бльшое число: " + sumOfSecondString()); Пример возвращения значений
                }
            } else {
                System.out.println("Тебе сказали по русски че ввести, не выебывайся давай");
            }
        }
    }

    public static void printArr(int[]... arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

// 1. Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный
//    массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;

    public static void sumOfPositiveElements(int[]... arr) { //нужно вынести двумерный массив в аргументы
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (arr[x][y] > 0) {
                    sum += arr[x][y];
                }
            }
        }
        System.out.println("Сумма всех чисел массива которые > 0:");
        System.out.println("=" + sum);
    }

// 2. Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
//    символов * со сторонами соответствующей длины;

    public static void squareOfArray(int size) {//добавить аргумент

        char[][] arr = new char[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '*';
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

// 3. Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
//    зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
//    Проверять количество строк и столбцов не требуется, условие “квадратности” нужно чтобы упростить вам
//    работу с диагоналями;

    public static void zeroingDiagonals(int[][] arr) {//прописать аргумент
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                if (i == j)
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        int j = arr.length - 1; //Дима сделал
//        for (int i = 0; i < arr.length; i++) {
//            arr[i][i] = 0;
//            arr[i][j] = 0;
//            j--;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i][i] = 0;
//        }


//        int[][] arr = new int[7][7];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = 3;
//                if (j == 6) {
//                    arr[i][j] = 0;
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

// 4. Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

    public static int findMax(int[][] array) {//прописать аргумент
//        int max = arr[0][0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Самое большое число в массиве: " + max);
        return max;
    }

// 5. Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по вашему выбору),
////    если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1

    public static int sumOfSecondString() {

        int[][] arr = {{10, 11, 12, 13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22, 23, 24}};
        System.out.println("Входящий двумерный массив:");
        int sum = 0;
//        if(arr.length < 2){ ДДима сделал :3
//            return -1;
//        }
//        лишний цикл for если в первом цикле поставить arr[1][y] то он не будет нужен
//        for (int i = 0; i < arr[1].length; i++) {
//            sum += arr[1][i];
//        }
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (x == 1) {
                    sum += arr[x][y];
                }
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма чисел второй строки массива = " + sum);
        return sum;
    }
}