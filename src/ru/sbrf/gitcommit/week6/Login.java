package ru.sbrf.gitcommit.week6;

import java.util.Objects;

public class Login {
    public static boolean Autorisation(String login, String password, String confirmPassword) {

        try {
            if (login.length() > 20 & !login.matches("\\w")) {
                throw new WrongLoginException("Incorrect login");
            } else if (password.length() > 20 & !password.matches("\\w")) {
                throw new WrongPasswordException("Incorrect password");
            } else if (!Objects.equals(confirmPassword, password)) {
                throw new WrongPasswordException("Incorrect confirmPassword");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}