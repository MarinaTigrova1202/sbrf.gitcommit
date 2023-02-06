package ru.sbrf.gitcommit.week6;

import java.util.Objects;

public class Login {
    public static boolean Autorisation(String login, String password, String confirmPassword) {

        try {
            if (login.length() > 20 & !login.matches("\\w")) {
                run();
            } else if (password.length() > 20 & !password.matches("\\w")) {
                run();
            } else if (!Objects.equals(confirmPassword, password)) {
                run();
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void run() throws WrongLoginException, WrongPasswordException {
    }
}