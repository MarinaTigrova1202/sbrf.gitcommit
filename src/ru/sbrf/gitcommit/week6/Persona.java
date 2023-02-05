package ru.sbrf.gitcommit.week6;

import java.util.Optional;

public class Persona {
    private final String name;
    private final String email;

    Persona(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
