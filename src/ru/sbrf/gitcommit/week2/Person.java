package ru.sbrf.gitcommit.week2;

public class Person {
    public String name = "Marina";
    public String taxId = "120286";
        public Person (String n,String t) {
        name = n;
        taxId = t;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                '}';
    }
}
