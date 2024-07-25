package ru.myauka.java.basic.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nДля начала работы введите номер задания которое хотите посмотреть:" +
                    "\nПростые задания:\n1 - addAndPrint\n2 - addArrSumAndPrint\n3 - addAllArray" +
                    "\n4 - increaseTheNumbers\n5 - greatestSum\nУсложненные задания:\n6 - sumTheArrays" +
                    "\n7 - checkElementsPosition\n8 - inversionArray\n9 - findTheDot");

            int a = scanner.nextInt();

            if (a >= 1 && a <= 9) {
                if (a == 1) {
                    addAndPrint();
                }
                if (a == 2) {
                    addArrSumAndPrint();
                }
                if (a == 3) {
                    addAllArray();
                }
                if (a == 4) {
                    increaseTheNumbers();
                }
                if (a == 5) {
                    greatestSum();
                }
                if (a == 6) {
                    sumTheArrays();
                }
                if (a == 7) {
                    checkElementsPosition();
                }
                if (a == 8) {
                    inversionArray();
                }
                if (a == 9) {
                    findTheDot();
                }

            } else {
                System.out.println("Тебе сказали по русски че ввести, не выебывайся давай");
            }
        }
    }

//     1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
//        консоль строку указанное количество раз;

    public static void addAndPrint() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую необходимо напечатать");
        String string = scanner.nextLine();
        System.out.println("Введите количесво раз которое необходимо отпечатать");
        int a = scanner.nextInt();

        for (int b = 0; b < a; b++) {
            System.out.println(string);
        }
    }
//     2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
//        элементы, значение которых больше 5, и печатающий полученную сумму в консоль;

    public static void addArrSumAndPrint() {

        int[] arr = {1, 7, 3, 5, 9, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Предоставленный целочисленный массив: " + Arrays.toString(arr));
        System.out.println("Итоговая сумма чисел массива, которые больше 5 = " + sum);
    }
//     3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
//        массив, метод должен заполнить каждую ячейку массива указанным числом;

    public static void addAllArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Исходное значение данных массива: " + Arrays.toString(arr));
        System.out.println("Веедите число для заполнения массива");
        int a = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

//     4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
//        массив, увеличивающий каждый элемент массива на указанное число;

    public static void increaseTheNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Исходное значение данных массива: " + Arrays.toString(arr));

        System.out.println("Веедите число для увеличения");
        int a = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }
//     5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
//        консоль информацию о том, сумма элементов какой из половин массива больше;

    public static void greatestSum() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Предоставленный целочисленный массив: " + Arrays.toString(arr));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("Сумма первой половины = " + sum1 + ", сумма второй половины равна = " + sum2);
        if (sum1 > sum2) {
            System.out.println(sum1 + ">" + sum2 + " - сумма элементов первой половины больше чем второй");
        } else {
            System.out.println(sum1 + " < " + sum2 + " - сумма элементов первой половины меньше чем второй");
        }
    }
//                                  ДОМАШНИЕ ЗАДАНИЯ ПОД ЗВЕЗДОЧКОЙ

//     6. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый массив равный
//        сумме входящих;

    public static void sumTheArrays() {
        int[] arr1 = {1, 2, 3, 4,};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.toString(arr1) + " + " + Arrays.toString(arr2) + " + " + Arrays.toString(arr3) + " = ");

        int[] arr = new int[Math.max((Math.max(arr1.length, arr2.length)), arr3.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arr[i] += arr3[i];
        }
        System.out.println(Arrays.toString(arr));
    }


//     7. Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
//        возрастания (по выбору пользователя)

    public static void checkElementsPosition() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр проверки порядка расположения элементов массива:" +
                "\n1. по возрастанию\n2. по убыванию");
        int will = scanner.nextInt();

        if (will == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("Массив идет в порядке возрастания");
                    break;
                } else {
                    System.out.println("Массив не идет в порядке возрастания");
                    break;
                }
            }
        }
        if (will != 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("Массив не идет в порядке убывания");
                    break;
                } else {
                    System.out.println("Массив идет в порядке убывания");
                    break;
                }
            }
        }
    }

    //    8. Реализуйте метод, “переворачивающий” входящий массив
    public static void inversionArray() {

        int[] arr = {9, 3, 6, 9, 5, 6, 2, 5};
        int[] arr1 = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; ) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j] += arr[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

//    9. Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
//       равны.

    public static void findTheDot() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr = {1, 2, 3, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {

            if (sum / 2 > sum2) {
                sum2 += arr[i];
            }
        }
        if (sum / 2 == sum2) {
            System.out.println("В массиве существует точка между равными суммами частей");
        } else {
            System.out.println("В массиве не существует точка между равными суммами частей");
        }
    }
}