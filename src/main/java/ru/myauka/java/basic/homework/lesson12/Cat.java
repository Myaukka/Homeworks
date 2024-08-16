package ru.myauka.java.basic.homework.lesson12;

public class Cat {

    private String name;
    private String color;
    private int age;
    private int foodCapacity;
    private int energyAmount;
    private boolean wellFed = false;

    public Cat(String name, String color, int age, int foodCapacity) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.foodCapacity = foodCapacity;
        this.energyAmount = 0;
    }

    public void info() {
        System.out.println("Имя: " + name +
                ", цвет: " + color +
                ", возраст: " + age +
                ", количество еды необходимое для насыщения: " + foodCapacity +
                ", количество энергии: " + energyAmount +
                ", состояние насыщения: " + (wellFed ? "сытый" : "голодный"));
    }

    public int feed(Plate plate) {

        if (plate.getFood() >= foodCapacity) {
            while (energyAmount < foodCapacity) {
                energyAmount++;
            }
            plate.setCurrAmount(plate.getFood() - energyAmount);
            wellFed = true;
            System.out.println("Кот накормлен");
        } else {
            System.out.println("Кот не ест если в тарелке меньше чем ему надо");
        }
        return energyAmount;
    }
    public int playWithCat() {
        if (energyAmount > 5) {
            System.out.println("Вы поиграли с " + name);
            return energyAmount -= 5;
        } else {
            System.out.println(name + " слишком устал чтобы играть");
        }return 0;
    }
}

