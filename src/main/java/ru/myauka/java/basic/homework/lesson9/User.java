package ru.myauka.java.basic.homework.lesson9;

public class User {

    private String firstName;
    private String midlName;
    private String lastName;
    private int birthYear;
    private String email;


    public User(String firstName, String midlName, String lastName, int birthYear, String email) {
        this.firstName = firstName;
        this.midlName = midlName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void info () {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + midlName + "\nГод рождения: "
                + birthYear + "\ne-mail: " + email);
    }

    public int ageOfUser() {
        return 2024 - birthYear;
    }
}
