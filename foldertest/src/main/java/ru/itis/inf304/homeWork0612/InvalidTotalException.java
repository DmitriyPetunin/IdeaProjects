package ru.itis.inf304.homeWork0612;

public class InvalidTotalException extends IllegalArgumentException {
    public InvalidTotalException() {
        super("Total should be greater than 0");
    }
}
