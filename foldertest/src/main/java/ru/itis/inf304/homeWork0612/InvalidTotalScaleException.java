package ru.itis.inf304.homeWork0612;

public class InvalidTotalScaleException extends IllegalArgumentException {
    public InvalidTotalScaleException(int currentScale, int validScale) {
        super("Total has scale " + currentScale + " instead of scale " + validScale);
    }
}