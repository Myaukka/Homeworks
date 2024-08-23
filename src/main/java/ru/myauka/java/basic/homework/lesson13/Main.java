package ru.myauka.java.basic.homework.lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//     *  Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
//     *  Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
//     *  Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием
//        типа местности
//     *  В приложении должны быть типы местности: густой лес, равнина, болото
//     *  Человек должен иметь возможность сесть на любой из этих видов транспорта, встать с него, или переместиться
//        на некоторое расстояние (при условии что он находится на каком-либо транспорте)
//     *  При попытке выполнить перемещение у человека, не использующего транспорт, считаем что он просто идет
//        указанное расстояние пешком
//     *  При перемещении Машина и Вездеход тратят бензин, который у них ограничен. Лошадь тратит силы.Велосипед
//        может использоваться без ограничений (можете для усложнения велосипедом
//        тратить силы “водителя”). При выполнении действия результат должен быть отпечатан в консоль
//     *  У каждого вида транспорта есть местности по которым он не может перемещаться: машина - густой лес и
//        болото, лошадь и велосипед - болото, вездеход - нет ограничений
//     *  При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие


        Scanner scanner = new Scanner(System.in);

        Human human = new Human("Stiven", 50);
        Car car = new Car();
        Horse horse = new Horse();
        ATV atv = new ATV();
        Bicycle bicycle = new Bicycle();

        System.out.println("Выберите местность для дистанции:" +
                "\n1. Густой лес" +
                "\n2. Болото" +
                "\n3. Равнина");

        String input1 = scanner.nextLine();

        switch (input1) {
            case "1":
                human.setTerrain(Terrain.DENSE_FOREST);
                break;
            case "2":
                human.setTerrain(Terrain.SWAMP);
                break;
            case "3":
                human.setTerrain(Terrain.PLAIN);
                break;
        }

        System.out.println("Ведите дистанцию");
        int distance = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Выберите транспорт для преодоления дистанции:" +
                "\n1. Машина" +
                "\n2. Лошадь" +
                "\n3. Велосипед" +
                "\n4. Вездеход" +
                "\n5. Покинуть транспорт");
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                human.setCurrentTransport(car);
                break;
            case "2":
                human.setCurrentTransport(horse);
                break;
            case "3":
                human.setCurrentTransport(bicycle);
                break;
            case "4":
                human.setCurrentTransport(atv);
                break;
            case "5":
                human.outOfTransport();
                break;
        }
        human.move(distance, human);

        Transport[] transports = {
                new Car(),
                new ATV(),
                new Bicycle(),
                new Horse()
        };
        Human human1 = new Human("Bob", 100);

        for (Transport transport : transports) {
            human1.setCurrentTransport(transport);
            for (Terrain terrain : Terrain.values()){
                human1.setTerrain(terrain);
                human1.move(20, human1);
            }
            human1.outOfTransport();
        }
    }
}

//        Transport bike = new Transport() {
//            @Override
//            public boolean ride(int distance) {
//                System.out.println("Мотоцикл проехал");
//                return true;
//            }
//        };

//        Transport bike = new Transport() {
//
//            final int gasOfBike = 100;
//            public boolean ride(int distance) {
//                if (gasOfBike >= distance) {
//                    System.out.println("Мотоцикл проехал успешно");
//                    return true;
//                }
//                System.out.println("Мотоцикл не проехал, кончился бензин");
//                return false;
//            }
//        };
//        bike.ride(distance);