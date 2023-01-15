package ru.sbrf.gitcommit.week4;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        int number = 0;
        //цикл while
        while (value < 11) {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
            value = value + 2;
        }
        value = 9;
        while (value >= 0) {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
            value = value - 2;
        }
        //цикл for
        for (value = 0; value <= 10; value = value + 2) {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
        }
        for (value = 9; value >= 0; value = value - 2) {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
        }
        //цикл do while
        value = 0;
        do {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
            value = value + 2;
        } while (value <= 10);
        value = 9;
        do {
            number++;
            if (number == 3) {
                System.out.println(value + "!");
                number = number - 3;
            } else {
                System.out.println(value);
            }
            value = value - 2;
        } while (value >= 0);
    }
}
