package ru.itis.inf304.probnik;

public class Order {
    private Client client;
    private OrderStatus orderStatus;
    private Povar  povar;
    private Pizza pizza;
    private Integer orderNumber;
    private Data date;

    public Order(Client client, Povar povar, Pizza pizza, OrderStatus orderStatus, Integer orderNumber, Data date) {
        this.client = client;
        this.orderStatus = orderStatus;
        this.povar = povar;
        this.pizza = pizza;
        this.orderNumber = orderNumber;
        this.date = date;
    }
}
