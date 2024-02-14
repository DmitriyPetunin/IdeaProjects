package ru.itis.inf304.homeWork0612;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            TradeRequest request = new TradeRequest(-2,new BigDecimal("10.4"));
            System.out.println(request);
            System.out.println("Trade registered with total price " + request.getTotalPrice() +  " for amount " + request.getAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}
