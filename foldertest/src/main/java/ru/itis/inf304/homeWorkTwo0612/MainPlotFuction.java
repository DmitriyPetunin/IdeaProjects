package ru.itis.inf304.homeWorkTwo0612;

import javax.swing.*;

public class MainPlotFuction {

    public static void main(String[] args) {

//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new PlotFunction(new HeartFunction());
//            }
//        });

        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print(0);
        }
        System.out.println("");

        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) System.out.print(0);
                else System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(0);
        }

        System.out.println("");

        //int n = 7;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) System.out.print(0);
            else System.out.print(" ");
        }
        System.out.println("");

        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print(0);
                } else if (j == i || j == n - i - 1) {
                    System.out.print(0);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) System.out.print(0);
            else System.out.print(" ");
        }
    }
}
