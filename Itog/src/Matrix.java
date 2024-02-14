import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public double[][] matrixArray;
    public int matrixStrokCount;
    public int matrixStolbCount;
    public double[][] freeKof;
    public double[] roots;
    public int rang;
    public int rangExtend;

    public int accuracy = 6; // дефолтное значение

    public void inputMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int strok = Integer.parseInt(in.nextLine());
        System.out.println("Введите количество столбцов: ");
        int stolb = Integer.parseInt(in.nextLine());
        System.out.println("Выберете способ ввода построчный или поэлементный");
        String put = in.nextLine();

        matrixStrokCount = strok;
        matrixStolbCount = stolb;
        double[][] randomMatrix = new double[strok][stolb];
        matrixArray = randomMatrix;

        if (matrixStrokCount <= 0 || matrixStolbCount <= 0) {
            System.out.println("Количество строк или столбцов равно 0");
        } else {
            if (put.equals("strok")) {
                for (int i = 0; i < strok; i++) {
                    System.out.println("Строка с позицией " + "[" + i + "] : ");
                    String[] str = in.nextLine().split(" ");
                    if (str.length > stolb) {
                        System.out.println("Вы ввели больше столбцов чем заявили в начале ERROR");
                        break;
                    } else {
                        double[] doublesArray = new double[str.length];
                        for (int k = 0; k < doublesArray.length; k++) {
                            randomMatrix[i][k] = Double.parseDouble(str[k]);
                        }
                    }
                }
            } else if (put.equals("element")) {
                for (int i = 0; i < strok; i++) {
                    for (int j = 0; j < stolb; j++) {
                        System.out.println("Элемент с позицией " + "[" + i + "," + j + "] : ");
                        randomMatrix[i][j] = in.nextDouble();
                    }
                }
            } else {
                System.out.println("Поменяйте способ ERROR");
            }
        }
    }

    public void outputMatrix() {
        System.out.println("Matrix [" + matrixStrokCount + "*" + matrixStolbCount + "]");
        Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
    }
    public void transposition() {
        double[][] mat = new double[matrixStolbCount][matrixStrokCount];
        for (int i = 0; i < matrixStrokCount; i++) {
            for (int j = 0; j < matrixStolbCount; j++) {
                mat[j][i] = matrixArray[i][j];
            }
        }
        matrixArray = mat;
        int b = matrixStolbCount;
        matrixStolbCount = matrixStrokCount;
        matrixStrokCount = b;
    }
    public void rang(double[][] A) {
        int R = 0;
        for (int i = 0; i < matrixStrokCount; i++) {
            if (str(A[i])) {
                R = R + 1;
            }
        }
        System.out.println("rang" +  " = " +  R);
        rang = R;
    }
    public void rangExtend(double[][] A, double[][] B) {
        int R = 0;
        double[][] extendMatrix = new double[matrixStrokCount][matrixStolbCount + 1];
        for (int k = 0; k < matrixStrokCount; k++) {
            for (int j = 0; j < matrixStolbCount; j++){
                extendMatrix[k][j] = A[k][j];
                extendMatrix[k][j+1] = B[k][0];
            }
        }
        Arrays.stream(extendMatrix).map(Arrays::toString).forEach(System.out::println);
        for (int i = 0; i < matrixStrokCount; i++) {
            if (str(extendMatrix[i])) {
                R = R + 1;
            }
        }
        System.out.println("rangExtend" +  " = " +  R);
        rangExtend = R;
    }
    public boolean str(double[] a) {
        int i = 0;
        boolean flag = false;
        while (i < a.length){
            if (a[i] != 0) {
                flag = true;
                break;
            } else {
                i = i + 1;
            }
        }
        return flag;
    }
    public void multiplicationMatrix(Matrix A, Matrix B) {
        Scanner in = new Scanner(System.in);
        if (A.matrixStolbCount != B.matrixStrokCount && B.matrixStolbCount == A.matrixStrokCount) {
            System.out.println("Умножение матрицы A на матрицу B невозможно! Произвести обратное умножение? ");
            String answer = in.nextLine();
            if (answer.equals("yes") || answer.equals("да") || answer.equals("д") || answer.equals("y")) {
                multi(B, A);
            }
        } else if (A.matrixStolbCount == B.matrixStrokCount) {
            System.out.println("Вы умножили матрицу A на B");
            multi(A, B);
        } else System.out.println("ERROR");
    }
    public void multi(Matrix A, Matrix B) {
        double[][] newMatrix = new double[A.matrixStrokCount][B.matrixStolbCount];
        for (int i = 0; i < A.matrixStrokCount; i++) { // строка A
            for (int j = 0; j < B.matrixStolbCount; j++) { // столбец B
                newMatrix[i][j] = 0;
                for (int k = 0; k < A.matrixStolbCount; k++) { // столбец A
                    newMatrix[i][j] += A.matrixArray[i][k] * B.matrixArray[k][j];
                }
            }
        }
        System.out.println("Новая матрица [" + A.matrixStrokCount + "*" + B.matrixStolbCount + "]");
        Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
    }
    public double[][] ml(double[][] b) {
        double[][] array = new double[matrixArray.length][b[0].length];
        System.out.println("matrixArray");
        Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
        System.out.println("afakfa" + array.length);
        for (int i = 0; i < matrixArray.length; i++) { // строка A
            for (int j = 0; j < b[0].length; j++) { // столбец B
                double sum = 0;
                for (int k = 0; k < matrixArray[0].length; k++) { // столбец A
                    sum += matrixArray[i][k] * b[k][j];
                }
                array[i][j] = sum;
            }
        }
        return array;
    }
    public void degreeMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите степень ");
        int deg = in.nextInt();
        double[][] newMatrix = copyArray(matrixArray);
        for (int i = 1; i < deg; i++){
            System.out.println("Матрица до умножения");
            Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
            newMatrix = ml(newMatrix);
            System.out.println("Матрица после умножения");
            Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
        }
        //Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
    }
    public void free() {
        Scanner in = new Scanner(System.in);
        double[][] kofs = new double[matrixStrokCount][1];
        System.out.println("Введите свободные коэффиценты поэлементно:");
        for (int i = 0; i < matrixStrokCount; i++) {
            System.out.println("Элемент с позицей" + "[" + i + "]");
            kofs[i][0] = in.nextDouble();
        }
        freeKof = kofs;
        System.out.println("Матрица свободных коэффицентов: ");
        Arrays.stream(freeKof).map(Arrays::toString).forEach(System.out::println);
    }
    public void gaus(double[][] A, double[][] B) {

        for (int q = 0; q < matrixStrokCount - 1; q++) { // 0,1 фиксированная строка прямого хода

            if (A[q][q] == 0 && A[q+1][q] != 0) {
                double tempB = B[q][0];
                B[q][0] = B[q+1][0];
                B[q+1][0] = tempB;
//                double[] tempA = A[q];
//                A[q] = A[q+1];
//                A[q+1] = tempA;
                swapGorizont(A[q],A[q+1], B[q][0], B[q+1][0]);
            }
            for (int m = q + 1; m < matrixStrokCount; m++) { // перебирает строки для обнуления столбца
                B[m][0] = solveB(A[q], A[m], B[q][0], B[m][0]);
                A[m] = solveA(A[q], A[m]);
                System.out.println("q =" + q +  "; m = " + m + ";");
                System.out.println("Матрица в настоящий момент: ");
                Arrays.stream(A).map(Arrays::toString).forEach(System.out::println);
                System.out.println("Матрица свободных коэффицентов в настоящий момент: ");
                Arrays.stream(B).map(Arrays::toString).forEach(System.out::println);
            }
        }
    }
    public double[][] gs(double[][] A,double[][] B) {

        for (int q = 0; q < matrixStrokCount - 1; q++) { // 0,1 фиксированная строка прямого хода

            if (A[q][q] == 0 && A[q+1][q] != 0) {
                double tempB = B[q][0];
                B[q][0] = B[q+1][0];
                B[q+1][0] = tempB;
                double[] tempA = A[q];
                A[q] = A[q+1];
                A[q+1] = tempA;
                matrixArray = copyArray(A);
                //swapGorizont(A[q],A[q+1],B[q][0],B[q+1][0]);
            }
            for (int m = q + 1; m < matrixStrokCount; m++) { // перебирает строки для обнуления столбца
                A[m] = sA(A[q], A[m]);
                System.out.println("q =" + q +  "; m = " + m + ";");
                System.out.println("Матрица в настоящий момент: ");
                Arrays.stream(A).map(Arrays::toString).forEach(System.out::println);
            }
        }
        return A;
    }
    public void gausObr(double[][] A, double[][] B) {
        System.out.println("Начался обратный ход");
        System.out.println("Матрица на данный момент:");
        Arrays.stream(A).map(Arrays::toString).forEach(System.out::println);
        for (int w = matrixStrokCount - 1; w > 0; w--) { // 2;1 для обратного хода

            if (A[matrixStrokCount - w - 1][matrixStrokCount - w - 1] == 0 && A[matrixStrokCount - w][matrixStrokCount - w - 1] != 0) {
                System.out.println("Вы свапнули строку w со строкой w - 1");
                swapGorizont(A[matrixStrokCount - w - 1],A[matrixStrokCount - w], B[matrixStrokCount - w - 1][0], B[matrixStrokCount - w][0]);
            }
            for (int t = w - 1; t >= 0; t--) { // 1,0; 0
                B[t][0] = solveObrB(A[t], A[w], B[t][0], B[w][0]);
                A[t] = solveObrA(A[t],A[w]);
                System.out.println("Матрица в настоящий момент: ");
                System.out.println("w = " + w +  "; t = " + t + ";");
                Arrays.stream(A).map(Arrays::toString).forEach(System.out::println);
                System.out.println("Матрица свободных коэффицентов в настоящий момент: ");
                Arrays.stream(B).map(Arrays::toString).forEach(System.out::println);
            }
        }
        matrixArray = A;
        freeKof = B;
    }
    public double[] solveA(double[] a, double[] a1) {
        System.out.println("str a:");
        System.out.println(Arrays.toString(a));
        System.out.println("str a1:");
        System.out.println(Arrays.toString(a1));
        double k = -(a1[0] / a[0]);
        System.out.println(k);
        int j = 0;
        while (j < matrixStolbCount) { // перебирает элеменеты по столбцу
            if (j < matrixStrokCount - 1) {
                if (a[j] != 0) {
                    System.out.println("Зашёл в первый ");
                    System.out.println("k = " + k);
                    a1[j] = a[j] * k + a1[j];
                    j = j + 1;
                } else if (a[j] == 0 && a1[j] == 0  && a[j + 1] != 0) {
                    k = -(a1[j + 1] / a[j + 1]);
                    a1[j] = a[j] * k + a1[j];
                    j = j + 1;
                } else {
                    j = j + 1;
                }
            } else {
                if (a[j] != 0) {
                    a1[j] = a[j] * k + a1[j];
                    j = j + 1;
                }
                else {
                    j = j + 1;
                }
            }
        }
        return a1;
    }
    public double[] sA(double[] a, double[] a1) {
        System.out.println("str a:");
        System.out.println(Arrays.toString(a));
        System.out.println("str a1:");
        System.out.println(Arrays.toString(a1));
        double k = -(a1[0] / a[0]);
        System.out.println(k);
        int wasK = 0;
        int j = 0;
        while (j < matrixStolbCount) { // перебирает элеменеты по столбцу
            if (j < matrixStrokCount - 1) {
                if (a[j] != 0) {
                    System.out.println("Зашёл в первый ");
                    System.out.println("k = " + k);
                    a1[j] = a[j] * k + a1[j];
                    wasK = 1;
                    j = j + 1;
                } else if (a[j] == 0 && a1[j] == 0  && a[j + 1] != 0 && wasK != 1) {
                    k = -(a1[j + 1] / a[j + 1]);
                    wasK = 2;
                    a1[j] = a[j] * k + a1[j];
                    j = j + 1;
                } else {
                    j = j + 1;
                }
            } else {
                if (a[j] != 0) {
                    a1[j] = a[j] * k + a1[j];
                    j = j + 1;
                }
                else {
                    j = j + 1;
                }
            }
        }
        return a1;
    }
    public double solveB(double[] a, double[] a1, double b, double b1) {
        int j = 0;
        double k = 0;
        while (j < matrixStolbCount) {
            if (j < matrixStrokCount - 1) {
                if (a[j] != 0) {
                    k = -(a1[j] / a[j]);
                    break;
                } else if (a[j] == 0 && a1[j] == 0 && a[j + 1] != 0) {
                    k = - (a1[j + 1] / a[j + 1]);
                    break;
                }
            }
            j = j + 1;
        }
        if (k != 0) {
            b1 = b*k + b1;
        }
        return b1;
    }
    public void swapGorizont(double[] a, double[] a1, double b, double b1) {
        double[] temp = new double[a.length];
        double tempB = b;
        b = b1;
        b1 = tempB;
        System.out.println(b);
        System.out.println(b1);
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i];
        }
        for (int j = 0; j < a1.length; j++) {
            a[j] = a1[j];
        }
        for (int q = 0; q < temp.length; q++) {
            a1[q] = temp[q];
        }
    }
    public double[] solveObrA(double[] a, double[] a1) {
        System.out.print("Первая строчка : ");
        System.out.println(Arrays.toString(a));
        System.out.print("Вторая строчка :");
        System.out.println(Arrays.toString(a1));
        double k = - (a[a.length -1] / a1[a1.length -1]);
        int j = 1;
        while (j < matrixStrokCount) { // 1,2
                if (a1[matrixStrokCount - j] != 0) {
                    System.out.println(" Первый случай");
                    System.out.println("j" + j);
                    a[matrixStrokCount - j] = a1[matrixStrokCount - j] * k + a[matrixStrokCount - j];
                    System.out.println(k);
                    j = j + 1;
                } else if (a[matrixStrokCount - j] == 0 & a1[matrixStrokCount - j] == 0 & a1[matrixStrokCount - j - 1] != 0) {
                    System.out.println("Второй случай");
                    System.out.println("j" + j);
                    k = - (a[matrixStrokCount - j - 1] / a1[matrixStrokCount - j - 1]);
                    System.out.println("a[matrixStrokCount - j - 1]" + a[matrixStrokCount - j - 1]);
                    System.out.println("a1[matrixStrokCount - j - 1]" + a1[matrixStrokCount - j - 1]);
                    a[matrixStrokCount - j] = a1[matrixStrokCount - j] * k + a[matrixStrokCount - j];
                    System.out.println("a[matrixStrokCount - j - 1]" + a[matrixStrokCount - j - 1]);
                    System.out.println("k = "  + k);
                    j = j + 1;
                    //break;
                } else {
                    j = j + 1;
                }
            }
        return a;
    }
    public double solveObrB(double[] a, double[] a1, double b, double b1) {
        double k = 0;
        int j = 1;
        while (j < matrixStrokCount) { // 1,2
            if (a1[matrixStrokCount - j] != 0) {
                k = - (a[a.length -1] / a1[a1.length -1]);
                break;
            } else if (a[matrixStrokCount - j] == 0 & a1[matrixStrokCount - j] == 0 & a1[matrixStrokCount - j - 1] != 0) {
                k = - (a[matrixStrokCount - j - 1] / a1[matrixStrokCount - j - 1]);
                break;
            }
            j = j + 1;
        }
        if (k != 0) {
            b = b1*k + b;
        }
        return b;
    }
    public void outputX(double[][] A, double[][] B) {
        double[] X = new double[matrixStrokCount];
        for (int r = 0; r < matrixStrokCount; r++) {
            X[r] = round(B[r][0] / A[r][r],accuracy);
            System.out.println("x" + r + " = " + X[r]);
        }
        roots = X;
    }
    public double findDeterminate(double[][] A) {
        double dt = 1;
        for (int i = 0; i < matrixStrokCount; i++) {
            dt = dt * A[i][i];
        }
        return dt;
    }
    public void cramer(double[][] A, double[][] B) {
        double[] determinate = new double[matrixStolbCount + 1];
        double[] X = new double[matrixStolbCount];

        double[][] newMatrix = new double[matrixStrokCount][matrixStolbCount];
        newMatrix = copyArray(matrixArray);
        determinate[0] = dt0();
        if (determinate[0] == 0) {
            System.out.println("определитель матрицы равен 0 решение по крамеру невозможно!");
        } else {
            for (int j = 0; j < matrixStolbCount; j++) {
                newMatrix = copyArray(matrixArray);
                for (int i = 0; i < matrixStrokCount; i++) {
                    newMatrix[i][j] = B[i][0];
                }
                newMatrix = gs(newMatrix,B);
                determinate[j+1] = findDeterminate(newMatrix);
                System.out.println("determinante" +"[" + (j + 1) + "]" + " = " + findDeterminate(newMatrix));
                System.out.println("matrixArray:");
                Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
            }
            for (int t = 1; t < X.length + 1; t++) {
                X[t - 1] = determinate[t] / determinate[0];
            }
            System.out.println("determinante:");
            System.out.println(Arrays.toString(determinate));
            System.out.println("матрица иксов:");
            System.out.println(Arrays.toString(X));
        }
    }
    public double dt0() {
        System.out.println("Начало dt0");
        double[][] A = new double[matrixStrokCount][matrixStolbCount];
        A = copyArray(matrixArray);
        A = gs(A, freeKof);
        //matrixArray = copyArray(A);
        System.out.println("determinante" + " = " + findDeterminate(A));
        System.out.println("Конец dt0");
        return findDeterminate(A);
    }
    public double[][] copyArray(double[][] A) {
        double[][] copiedArray = new double[matrixStrokCount][matrixStolbCount];
        for (int i = 0; i < matrixStrokCount; i++) {
            copiedArray[i] = Arrays.copyOf(A[i], matrixStolbCount);
        }
        return copiedArray;
    }

    private void roundAll() {
        for (int i = 0; i < matrixStrokCount; i++) {
            for (int j = 0; j < matrixStolbCount; j++) {
                matrixArray[i][j] = round(matrixArray[i][j], accuracy);
            }
        }
    }
    private static double round(double x, int accuracy) {
        return Math.round(x * Math.pow(10, accuracy)) / Math.pow(10, accuracy);
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}