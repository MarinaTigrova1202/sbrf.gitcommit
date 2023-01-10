package ru.sbrf.gitcommit.week3;

public class Main {
    public static void main(String[] args) {
        //перегрузка метода
        PrintUtils print = new PrintUtils(1);
       // PrintUtils print = new PrintUtils("Hello");
        System.out.println(print);
        System.out.println(print);
        // метод, который принимает в качестве параметра любую строку, например ""I like Java!"
        String words = "I like Java!";
        // Распечатать последний символ строки. Используем метод String.charAt() и length()
        System.out.println(words.length());
        int index = (words.length()-1);
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
        System.out.println(words.substring(7,11));
    }
}
