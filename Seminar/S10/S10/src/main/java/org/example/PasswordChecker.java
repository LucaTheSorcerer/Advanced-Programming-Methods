package org.example;

import java.util.Arrays;
import java.util.List;

public class PasswordChecker {
    public static void main(String[] args) {
        List<String> passwords = Arrays.asList(
                "Secure123!",
                "Weak",
                "Password123",
                "Strong@Password"
        );

        passwords.forEach(password -> {
            boolean isValid = isPasswordValid(password);
            System.out.println(password + ": " + (isValid ? "Valid" : "Not Valid"));
        });
    }

    private static boolean isPasswordValid(String password) {
        return password.length() > 8 &&
                password.chars().anyMatch(Character::isDigit) &&
                password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(ch -> "!@#$%^&*()".indexOf(ch) != -1);
    }
}
