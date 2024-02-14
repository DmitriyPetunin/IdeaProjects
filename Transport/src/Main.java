import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars(150,4,12,20);
        Planes plane1 = new Planes(700,120,16);
        Trains train1 = new Trains(120,300,20,"Новороссийск - Казань");

        System.out.println("Выберете способ передвижения :");
        Scanner in = new Scanner(System.in);
        String transport = in.nextLine();
        switch (transport) {
            case "plane" -> System.out.println(plane1.kiberMoveAtoB());
            case "car" -> System.out.println(car1.kiberMoveAtoB());
            case "train" -> System.out.println(train1.kiberMoveAtoB());
            default -> System.out.println("Введен не корректный способ передвижения ERROR");
        }
        Transport[] move = new Transport[]{car1, plane1, train1};
        for (Transport d : move) {
            System.out.println(d.moveOn()); // полиморфный вызов метода
        }
    }
}