package ru.sbrf.gitcommit.week5;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();
        Printable[] printables = {book, magazine};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
//Рядом с методом main создать статический метод max(T t1, T t2)
// возвращающий максимальное из двух Т.
// Вывести в консоль максимальное значение.
// Использовать ограничение интерфейсом Comparable и соответствующий метод"
        System.out.println(max(1, 2));
    }

    public static <T extends Comparable> T max(T t1, T t2) {
        return t1.compareTo(t2) > 0 ? t1 : t2;

    }
}
