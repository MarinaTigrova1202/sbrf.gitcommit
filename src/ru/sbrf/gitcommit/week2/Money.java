package ru.sbrf.gitcommit.week2;

public class Money {
        public long amount = 22333;
        public String currency = "RUB";

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
