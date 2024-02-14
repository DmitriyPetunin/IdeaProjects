package ru.itis.inf304.homeWork0912;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomArray =  {1,2,3,5,6,7};
        try {
            Array A = new Array(randomArray,0);
            System.out.println(Arrays.toString(A.array));
            A.findLess(A.array,A.inputElement);
        } catch (InvalidSignElementException | InvalidLessThanSmallestElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
