package ru.sbrf.gitcommit.week2;

public class Person {
    public String name;
    public String taxId;

    public Person(){}
    public Person (String name,String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                '}';
    }
}
