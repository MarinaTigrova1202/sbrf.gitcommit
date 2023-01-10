package ru.sbrf.gitcommit.week2;

public class Agreement {
    String reference = "Соглашение";
    Money amount = new Money();
    Person applicant = new Person("Света","110890");

    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", amount=" + amount +
                ", applicant=" + applicant +
                '}';
    }
}

