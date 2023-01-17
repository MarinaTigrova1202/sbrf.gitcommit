package ru.sbrf.gitcommit.week4;

import ru.sbrf.gitcommit.week4.service.AgreementService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        int number = 0;

        System.out.println("цикл while");
        while (value < 11) {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
            value += 2;
        }

        value = 9;
        number = 0;
        while (value >= 0) {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
            value -= 2;
        }

        System.out.println();
        System.out.println("цикл for");
        number = 0;
        for (value = 0; value <= 10; value = value + 2) {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
        }

        number = 0;
        for (value = 9; value >= 0; value -= 2) {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
        }

        System.out.println();
        System.out.println("цикл do while");
        value = 0;
        number = 0;
        do {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
            value += 2;
        } while (value <= 10);

        value = 9;
        number = 0;
        do {
            number++;
            if (number % 3 == 0) {
                System.out.println(value + "!");
            } else {
                System.out.println(value);
            }
            value -= 2;
        } while (value >= 0);

        System.out.println();
        System.out.println("Оператор switch");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 10:
                System.out.println("Ты закончил младшую школу");
                break;
            case 11:
                System.out.println("Ты пошел в старшую школу");
                break;
            case 17:
                System.out.println("Ты закончил школу");
                break;
            case 18:
                System.out.println("Ты пошел в университет");
                break;
            case 22:
                System.out.println("Ты пошел работать");
                break;
            case 65:
                System.out.println("Добро подаловать на пенсию");
                break;
            case 100:
                System.out.println("Game over");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");
        }

        System.out.println();
        System.out.println("Массив");
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }

        Agreement agreementMain = new Agreement(AgreementStatus.ACTIVE);
        AgreementService agreementService = new AgreementService();
        agreementService.close(agreementMain);
        System.out.println(agreementMain.getAgreementStatus());
    }
}
