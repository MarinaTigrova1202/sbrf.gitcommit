package ru.sbrf.gitcommit.week6;

import ru.sbrf.gitcommit.week2.Person;

public class Main {
    public static void main(String[] args) {
        Persona marina = new Persona("Марина", "marinatigova@yandex.ru");
        String email = marina
                .getEmail()
                .orElse("у Марины нет почты");
        System.out.println(email);

    }

}
