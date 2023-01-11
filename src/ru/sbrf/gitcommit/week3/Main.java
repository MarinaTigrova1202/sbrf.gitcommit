package ru.sbrf.gitcommit.week3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //перегрузка метода
        System.out.println(PrintUtils.print(1));
        System.out.println(PrintUtils.print("Hello"));

        // метод, который принимает в качестве параметра любую строку, например ""I like Java!"
        String words = "I like Java!";
        // Распечатать последний символ строки. Используем метод String.charAt() и length()
        System.out.println(words.length());
        int index = (words.length() - 1);
        System.out.println(words.charAt(index));
        // Проверить, заканчивается ли строка подстрокой “!”. Используем метод String.endsWith().
        System.out.println(words.endsWith("!"));
        // Проверить, начинается ли строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(words.startsWith("I like"));
        // Проверить, содержит ли строка подстроку “Java”. Используем метод String.contains().
        System.out.println(words.contains("Java"));
        // Найти позицию подстроки “Java” в строке “I like Java!”.
        System.out.println(words.indexOf("Java"));
        // Преобразуйте строку к верхнему регистру.
        System.out.println(words.toUpperCase());
        // Преобразуйте строку к нижнему регистру.
        System.out.println(words.toLowerCase());
        // Вырезать строку Java c помощью метода String.substring().
        System.out.println(words.substring(7, 11));

        //классы обертки
        Wrapper wrapper = new Wrapper();
        System.out.println(wrapper.numberZero);
        System.out.println(wrapper.numberNull);

        //Дата и время
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня = " + today);
        LocalDate FourMonthAgo = today.minusMonths(4);
        System.out.println("Четыре месяца назад было = " + FourMonthAgo);
        System.out.println("Текущий месяц = " + today.getMonth());
    }
}
