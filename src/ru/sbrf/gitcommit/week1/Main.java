package ru.sbrf.gitcommit.week1;

public class Main {
    public static void main(String[] args) {

        // Написать первую программу, которая выводит текст "учим java" в консоль.
        System.out.println("учим java");

        //  В программе (см прошлое задание) создать 2 переменные типа int, их сумму положить в третью переменную.
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println("Сумма первой и второй переменной =" + sum);

        // В программе создать примитивы всехтипов и вывести в консоль
        int myInt = 3266;
        System.out.println("int = " + myInt);
        long myLong = 24578458;
        System.out.println("long = " + myLong);
        double myDouble = 235.35;
        System.out.println("double = " + myDouble);
        float myFloat = 2362.3f;
        System.out.println("float = " + myFloat);
        char myChar = 'a';
        System.out.println("char = " + myChar);
        boolean myBoolean = true;
        System.out.println("boolean = " + myBoolean);
        byte myByte = 100;
        System.out.println("byte = " + myByte);
    }
}
