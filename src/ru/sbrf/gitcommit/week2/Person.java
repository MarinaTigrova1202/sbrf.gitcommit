package ru.sbrf.gitcommit.week2;

public class Person {
    private String name;
    private String taxId;

    public Person() {
    }

    public Person(String name, String taxId) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}
