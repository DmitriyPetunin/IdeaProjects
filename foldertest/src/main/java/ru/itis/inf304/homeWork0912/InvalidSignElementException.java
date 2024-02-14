package ru.itis.inf304.homeWork0912;

public class InvalidSignElementException extends IllegalArgumentException {
    public InvalidSignElementException() {
        super("negative number entered");
    }
}
