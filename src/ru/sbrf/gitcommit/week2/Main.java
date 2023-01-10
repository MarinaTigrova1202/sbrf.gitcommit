package ru.sbrf.gitcommit.week2;


public class Main {
          public static void main(String[] args) {
              //конструкторы
             Money money1 = new Money(2546,"RUB");
             Person person1 = new Person("Marina","2517");
             Agreement agreement1 = new Agreement("222",money1,person1);
              System.out.println(agreement1);

              Money money2 = new Money(7887,"EUR");
              Person person2 = new Person("Zarina","9822");
              Agreement agreement2 = new Agreement("333",money2,person2);
              System.out.println(agreement2);

              //пакеты и импорты
              String str = "строка";
              Class aClass = str.getClass();
              System.out.println(aClass.getName());
              System.out.println(aClass.getSimpleName());
          }
}
