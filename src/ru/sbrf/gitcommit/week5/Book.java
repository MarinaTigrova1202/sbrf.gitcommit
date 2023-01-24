package ru.sbrf.gitcommit.week5;

public class Book implements Printable {
    String book = new String("Fight Club");
    String book1 = new String("The Great Gatsby");
    String book2 = new String("Little Women");

    public void print() {
        System.out.println(book + ", " + book1 + ", " + book2);
    }
}
