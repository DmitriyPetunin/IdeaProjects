import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix();
        //Matrix B = new Matrix();
        //A.setAccuracy(8);
        A.inputMatrix();
        //B.inputMatrix();

        A.outputMatrix();
        //B.outputMatrix();
//        A.multiplicationMatrix(A,B);
//        A.free();

        A.free();
        A.gaus(A.matrixArray,A.freeKof); // прямой ход гаус
        A.gausObr(A.matrixArray,A.freeKof); // обратный ход гаус
//        A.outputMatrix();
//        //A.degreeMatrix();
//        //A.cramer(A.matrixArray, A.freeKof);
//
        A.rang(A.matrixArray); // ранг обычной матрицы
        A.rangExtend(A.matrixArray, A.freeKof); // ранг расширенной матрицы
//        if (A.rang == A.matrixStrokCount) {
//            System.out.println(A.rang);
//            A.outputX(A.matrixArray,A.freeKof);
//            System.out.println("Система имееет одно решение");
//            for (int i = 0; i < A.matrixStrokCount; i++) {
//                System.out.println("String: " + i + " " +  Arrays.toString(A.matrixArray[i]) + " = " + Arrays.toString(A.freeKof[i]) + ";  x" + i + " = " + A.roots[i]);
//            }
//        } else if (A.rangExtend > A.rang) {
//            System.out.println(A.rang);
//            System.out.println(A.rangExtend);
//            System.out.println("Система не имеет решений");
//        } else if (A.rang < A.matrixStrokCount) { // ранг меньше количества иксов
//            System.out.println(A.rang);
//            System.out.println("Система имеет множество решений");
//        }
    }
}