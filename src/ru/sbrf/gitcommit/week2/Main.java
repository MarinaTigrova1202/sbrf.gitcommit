package ru.sbrf.gitcommit.week2;


public class Main {
          public static void main(String[] args) {
              //конструкторы
              String accreditive = "str1";
              String accreditive2 = "str2";
              Person acr = new Person();
              System.out.println(accreditive + acr.name + acr.taxId);
              //пакеты и импорты
              String str = "строка";
              Class aClass = str.getClass();
              System.out.println(aClass.getName());
              System.out.println(aClass.getSimpleName());
          }
}
