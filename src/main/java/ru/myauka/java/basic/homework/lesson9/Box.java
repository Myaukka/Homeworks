package ru.myauka.java.basic.homework.lesson9;

import java.util.Scanner;

public class Box {

//    Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
//    Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после
//    создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно
//    складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
//    только при условии что коробка открыта (предметом читаем просто строку). Выполнение методов должно
//    сопровождаться выводом сообщений в консоль.

    private String color;
    private int size;
    private boolean isOpen;
    private String item;

    public Box(String color, int size, String item) {
        this.color = color;
        this.size = size;
        this.isOpen = true;
        this.item = item;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color);
    }

    public void info() {

//  Дима сделал
//        System.out.println("Информация о коробке: " +
//                "\nРазмер: " + size +
//                "\nЦвет: " + color +
//                "\nКоробка: " + (isOpen ? "открыта" : "закрыта") +
//                "\nНаличие предмета: " );

        System.out.println("Информация о коробке: \nРазмер: " + size + "\nЦвет: " + color + "\nНаличие предмета: " +
                (item == null ? "пусто" : item));
        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public void setOpen(boolean open) {
        if (open) {
            isOpen = true;
            System.out.println("Коробка открылась");
        } else {
            isOpen = false;
            System.out.println("Коробка закрылась");
        }
    }
    public void setItem() {
        if (isOpen) {
            if (this.item == null) {
                System.out.println("Какой предмет добавить в коробку?");
                Scanner scanner = new Scanner(System.in);
                this.item = scanner.nextLine();
                System.out.println("Предмет " + item + " добавлен в коробку");
            } else {
                System.out.println("В коробке уже есть предмет");
            }
        } else {
            System.out.println("Чтобы добавить или убрать предмет нужно открыть коробку");
        }
    }
    public void deleteItem() {
        if (isOpen) {
            if (this.item != null) {
                this.item = null;
                System.out.println("Предмет удален из коробки");
            } else {
                System.out.println("В коробке пусто");
            }
        } else {
            System.out.println("Чтобы добавить или убрать предмет нужно открыть коробку");
        }
    }
}
