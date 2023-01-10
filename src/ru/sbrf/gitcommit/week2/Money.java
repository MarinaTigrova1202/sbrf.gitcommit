package ru.sbrf.gitcommit.week2;

public class Money {
        public long amount;
        public String currency;
    public Money(){}
    public Money (long amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
