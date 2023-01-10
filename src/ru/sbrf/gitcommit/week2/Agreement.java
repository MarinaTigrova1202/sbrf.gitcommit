package ru.sbrf.gitcommit.week2;

public class Agreement {
    String reference;
    Money amount;
    Person applicant;
    protected Agreement(){}
    protected Agreement(String reference, Money amount, Person applicant) {
        this.reference = reference;
        this.amount = amount;
        this.applicant = applicant;
    }


    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", amount=" + amount +
                ", applicant=" + applicant +
                '}';
    }
}

