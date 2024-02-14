package ru.itis.inf304.probnik;

public class Client extends Human {
    private Discount discount;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public Client(String name, Gender gender, Discount discount) {
        this.gender = gender;
        this.name = name;
        this.discount = discount;
    }

}
