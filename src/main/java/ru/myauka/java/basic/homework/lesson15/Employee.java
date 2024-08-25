package ru.myauka.java.basic.homework.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String name;
    private final int age;

    public Employee(String name, int ade) {
        this.name = name;
        this.age = ade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " Age: " + age;
    }

    public static List<String> getEmployeeName(List<Employee> employeeList) {

        List<String> employeeNameList = new ArrayList<>(employeeList.size());

        for (Employee e : employeeList) {
            employeeNameList.add(e.getName());
        }
        return employeeNameList;
    }


    public static List<Employee> getEmployeeByAge(List<Employee> employeeList, int age) {

        List<Employee> employeeAgeList = new ArrayList<>();

        for (Employee e : employeeList) {
            if (e.getAge() >= age) {
                employeeAgeList.add(e);
            }
        }
        return employeeAgeList;
    }

    public static boolean isAgeSatisfactory(List<Employee> employeeList, int age) {
        return averageAge(employeeList) / employeeList.size() > age;
    }

    public static int averageAge(List<Employee> employeeList) {

        int sum = 0;

        for (Employee e : employeeList) {
            sum += e.getAge();
        }
        return sum / employeeList.size();
    }


    public static Employee getYoungestEmployee(List<Employee> employeeList) {

        Employee minAge = employeeList.get(0);
        for (Employee e : employeeList) {
            if (e.getAge() < minAge.getAge()) {
                minAge = e;
            }
        }
        return minAge;
    }
}

