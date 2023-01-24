package ru.sbrf.gitcommit.week5;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();
        Printable[] printables = {book, magazine};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}
