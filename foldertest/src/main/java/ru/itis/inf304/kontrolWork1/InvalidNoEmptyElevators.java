package ru.itis.inf304.kontrolWork1;

public class InvalidNoEmptyElevators extends IllegalArgumentException {
    public InvalidNoEmptyElevators(){
        super("No elevators available");
    }
}
