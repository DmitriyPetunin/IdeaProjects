package ru.itis.inf304.probnik;

import java.util.Scanner;

public class LinkedOrders implements Inumber {
    private NumberOrder first;
    private NumberOrder current;
    private int size;
    public LinkedOrders() {
        NumberOrder root = new NumberOrder(1);
        current = root;
        for (int i = 2; i <= 10; i++) {
            current.next = new NumberOrder(i);
            current = current.next;
        }
        current.next = root;
    }
    @Override
    public int next() {
        current = current.next;
        int result =  current.number;
        return result;
    }

}
