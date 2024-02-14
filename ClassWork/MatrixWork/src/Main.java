import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("С какой матрицей вы хотите работать?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer.equals("sq")){
            SquareMatrix A = new SquareMatrix();
            SquareMatrix B = new SquareMatrix();
            System.out.println("Умножение матриц или сложение или умножение на число или определитель");
            String answer2 = in.nextLine();
            switch (answer2) {
                case "multi" ->{
                    A.inputMatrix();
                    B.inputMatrix();
                    A.outputMatrix();
                    B.outputMatrix();
                    A.multi(B);
                }
                case "Addition" -> {
                    A.inputMatrix();
                    B.inputMatrix();
                    A.outputMatrix();
                    B.outputMatrix();
                    A.matrixAddition(B);
                }
                case "d2" -> {
                    A.inputMatrix();
                    A.determinantTwo();
                }
                case "d3" -> {
                    A.inputMatrix();
                    A.outputMatrix();
                    A.determinantThree();
                }
                case "multiByNum" -> {
                    A.inputMatrix();
                    A.outputMatrix();
                    A.multiByNum();
                }
            }

        } else if (answer.equals("dif")){
            DifMatrix A = new DifMatrix();
            DifMatrix B = new DifMatrix();
            System.out.println("Умножение матриц или сложение или умножение на число");
            String answer2 = in.nextLine();
            switch (answer2) {
                case "multi" -> {
                    A.inputMatrix();
                    B.inputMatrix();
                    A.outputMatrix();
                    B.outputMatrix();
                    A.multi(B);
                }
                case "Addition" -> {
                    A.inputMatrix();
                    B.inputMatrix();
                    A.outputMatrix();
                    B.outputMatrix();
                    A.matrixAddition(B);

                }
                case "multiByNum" -> {
                    A.inputMatrix();
                    A.outputMatrix();
                    A.multiByNum();
                }
            }
        }
    }
}