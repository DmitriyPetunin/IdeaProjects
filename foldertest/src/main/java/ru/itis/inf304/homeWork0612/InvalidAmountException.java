package ru.itis.inf304.homeWork0612;

public class InvalidAmountException extends IllegalArgumentException {
    public InvalidAmountException() {
        super("Amount should be greater than 0");
    }
}
