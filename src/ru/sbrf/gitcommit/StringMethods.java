package ru.sbrf.gitcommit;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String words = "I like Java!";
        System.out.println(words.length());
        int index = (words.length()-1);
        System.out.println(words.charAt(index));
        System.out.println(words.endsWith("!"));
        System.out.println(words.startsWith("I like"));
        System.out.println(words.contains("Java"));
        System.out.println(words.indexOf("Java"));
        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());
        System.out.println(words.substring(7,11));
          }
}
