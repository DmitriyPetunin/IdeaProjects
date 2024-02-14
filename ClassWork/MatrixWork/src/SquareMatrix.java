public class SquareMatrix extends Matrix{
    public void determinantTwo(){
        if (matrixStolbCount == matrixStrokCount & matrixStolbCount == 2) {
            System.out.println(matrixArray[0][0] * matrixArray[1][1] - matrixArray[0][1] * matrixArray[1][0]);
        } else System.out.println("Введена не квадратная матрица 2 на 2!");
    }
    public void determinantThree(){
        if (matrixStolbCount == matrixStrokCount & matrixStolbCount == 3) {
            float sum0 = matrixArray[0][0] * matrixArray[1][1] * matrixArray[2][2];
            float sum1 = matrixArray[0][1] * matrixArray[1][2] * matrixArray[2][0];
            float sum2 = matrixArray[1][0] * matrixArray[2][1] * matrixArray[0][2];

            float sum3 = matrixArray[0][2] * matrixArray[1][1] * matrixArray[2][0];
            float sum4 = matrixArray[0][1] * matrixArray[1][0] * matrixArray[2][2];
            float sum5 = matrixArray[1][2] * matrixArray[2][1] * matrixArray[0][0];
            float c = sum0 + sum1 + sum2 - sum3 - sum4 - sum5;
            System.out.println(c);
        } else System.out.println("Введена не квадратная матрица 3 на 3!");
    }
}
