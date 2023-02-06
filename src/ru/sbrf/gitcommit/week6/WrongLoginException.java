package ru.sbrf.gitcommit.week6;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String description) {
        super(description);
    }
}
