package ru.itis.inf304.AICD;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        double x = 3.0;
        int p = 9;
        double temp = x;

//        for (int i = 0; i < p; i++) {
//            temp = temp * x;
//        }

        int st = 1;
        while (st*2 < p){
            temp = temp * temp;
            st*=  2;
        }
        while (p - st > 0){
            temp = temp * x;
            st = st + 1;
        }
        System.out.println(temp);
        // Проверка на чистоту
        int r = 1373;
        for (int i = 2; i < sqrt(p) + 1; i++){
            if (r % i == 0){
                break;
            }
        }
        // На простые множители
        int k = 0;
        int w = 18;
        int[] arr = new int[20];
        for (int i = 2; i < sqrt(w) + 1; i++){ // корень
            if (i % 2 != 0 && i > 2){
                continue;
            }
            while (w % i == 0){
                w = w / i;
                arr[k] = i;
                k++;
            }
        }
    }
}
