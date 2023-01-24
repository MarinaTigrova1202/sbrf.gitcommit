package ru.sbrf.gitcommit.week5;

public class Magazine implements Printable {
    String magazine = new String("Time");
    String magazine1 = new String("People");

    public void print() {
        System.out.println(magazine + ", " + magazine1);
    }
}
