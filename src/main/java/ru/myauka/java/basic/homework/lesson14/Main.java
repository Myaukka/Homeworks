package ru.myauka.java.basic.homework.lesson14;

public class Main {

//      * Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4. Если передан массив
//        другого размера необходимо бросить исключение AppArraySizeException.
//      * Метод должен обойти все элементы массива, преобразовать в int и просуммировать. Если в каком-то элементе
//        массива преобразование не удалось (например, в ячейке лежит текст вместо числа), должно быть брошено
//        исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//      * В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException и
//        AppArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход
//        корректный массив).

    public static void main(String[] args) {

        String[][] strings = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4", "2"}};
        try {
            parseStringToIntAndSum(strings);
        } catch (AppArrayDataException | AppArraySizeException e) {
            System.err.println(e);
        }
    }

    public static void parseStringToIntAndSum(String[][] strings) throws AppArraySizeException,
            AppArrayDataException {

        int[][] numbers = new int[strings.length][strings.length];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (i >= 4 || j >= 4) throw new AppArraySizeException("Массив может быть только 4 на 4");
                isNumber(strings);
                numbers[i][j] = Integer.parseInt(strings[i][j]);
            }
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Сумма всех элементов входящего массива: " + sum);
    }

    public static void isNumber(String[][] strings) throws AppArrayDataException {
        int a = 0;
        int b = 0;
        try {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    a = i;
                    b = j;
                    Integer.parseInt(strings[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new AppArrayDataException(a, b);
        }
    }
}