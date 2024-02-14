package ru.itis.inf304.homeWork0912;

public class InvalidLessThanSmallestElementException extends IllegalArgumentException{
    public InvalidLessThanSmallestElementException() {
        super("element entered is less than the smallest one");
    }
}
