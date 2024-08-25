package ru.myauka.java.basic.homework.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ЗАДАНИЯ С ARRAY LIST<p>
 * 1. Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
 * последовательных значений в указанном диапазоне (min и max включительно, шаг - 1); <p>
 * <p>
 * 2. Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
 * значение которых больше 5, и возвращающий сумму;<p>
 * <p>
 * 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен
 * переписать каждую заполненную ячейку списка указанным числом;<p>
 * <p>
 * 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий
 * каждый элемент списка на указанное число;<p>
 * <p>
 * ЗАДАНИЯ СО СПИСКОМ СОТРУДНИКОВ<p>
 * * Создайте класс Сотрудник с полями: имя, возраст;<p>
 * <p>
 * * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;<p>
 * <p>
 * * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и
 * возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;<p>
 * <p>
 * * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и
 * проверяющий что средний возраст сотрудников превышает указанный аргумент;<p>
 * <p>
 * * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого
 * молодого сотрудника.
 */

public class Homework9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(30);
        list.add(16);

        System.out.println("\nЗадание 1.\n");
        System.out.println(minMaxArrayList(10, -10));

        System.out.println("\nЗадание 2.\n");
        System.out.println("Сумма элементов списка которые > 5: " + sumElementsMoreThenFive(list));

        System.out.println("\nЗадание 3.\n");
        System.out.println("Введите число которым заполнить массив");
        int a = scanner.nextInt();
        addArray(list, a);

        System.out.println("\nЗадание 4.\n");
        System.out.println("Введите число на которое увеличить элементы массива");
        int b = scanner.nextInt();
        increaseArray(list, b);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Karen", 42));
        employeeList.add(new Employee("Michael", 36));
        employeeList.add(new Employee("Stan", 25));
        employeeList.add(new Employee("Robert", 30));
        employeeList.add(new Employee("Chuck", 45));

        System.out.println("\nЗадания со списком сотрудников:");
        System.out.println("\nЗадание 1.\n");
        System.out.println("Список имен сотрудников: " + Employee.getEmployeeName(employeeList));

        System.out.println("\nЗадание 2.\n");
        int age = 30;
        System.out.println("Список сотрудников старше " + age + " лет " + Employee.getEmployeeByAge(employeeList, age));

        System.out.println("\nЗадание 3.\n");
        int age1 = 34;
        System.out.println("Средний возраст сотрудников: " + Employee.averageAge(employeeList) +
                (Employee.isAgeSatisfactory(employeeList, age1) ? ", не превышает" : ", превышает") +
                " желательный средний возраст: " + age1);


        System.out.println("\nЗадание 4.\n");
        System.out.println("Самый молодой сотрудник: " + Employee.getYoungestEmployee(employeeList));
    }

    public static List<Integer> minMaxArrayList(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();

        if (min < max) {
            for (int i = min; i <= max; i++) {
                arrayList.add(min);
                min++;
            }
        } else {
            for (int i = max; i <= min; i++) {
                arrayList.add(max);
                max++;
            }
        }
        return arrayList;
    }

    public static int sumElementsMoreThenFive(ArrayList<Integer> list) {

        System.out.println(list);
        int sum = 0;

        for (Integer integer : list) {
            if (integer > 5) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void addArray(ArrayList<Integer> list, int a) {

        System.out.println(list);
        list.replaceAll(ignored -> a);
        System.out.println(list);
    }

    public static void increaseArray(ArrayList<Integer> list, int a) {

        System.out.println(list);
        list.replaceAll(n -> n + a);
        System.out.println(list);
    }
}