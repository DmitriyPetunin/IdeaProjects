import java.util.Arrays;
import java.util.Scanner;

public abstract class Matrix {
   public int matrixStrokCount;
   public int matrixStolbCount;
   public float[][]  matrixArray;

   public void inputMatrix(){
      Scanner in = new Scanner(System.in);
      System.out.println("Введите количество строк: ");
      int strok = Integer.parseInt(in.nextLine());

      System.out.println("Введите количество столбцов: ");
      int stolb = Integer.parseInt(in.nextLine());
      System.out.println("Выберете способ ввода построчный или поэлементный");
      String put = in.nextLine();

      matrixStrokCount = strok;
      matrixStolbCount = stolb;
      float[][] randomMatrix = new float[strok][stolb];
      matrixArray = randomMatrix;

      if (put.equals("strok")) {
         for (int i = 0; i < strok; i++) {
            System.out.println("Строка с позицией " + "[" + i + "] : ");
            String[] str = in.nextLine().split(" ");
            if (str.length > stolb){
               System.out.println("Вы ввели больше столбцов чем заявили в начале ERROR");
               break;
            } else {
               float[] floatsArray = new float[str.length];
               for (int k = 0; k < floatsArray.length; k++) {
                  randomMatrix[i][k] = Float.parseFloat(str[k]);
               }
            }
         }
      } else if (put.equals("element")) {
         for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
               System.out.println("Элемент с позицией " + "[" + i + "," + j + "] : ");
               randomMatrix[i][j] = in.nextFloat();
            }
         }
      } else {
         System.out.println("Поменяйте способ ERROR");
      }
   }
   public void outputMatrix(){
      System.out.println("Matrix [" + matrixStrokCount + "*" + matrixStolbCount + "]");
      Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
   }
   public void multiByNum(){
      Scanner in = new Scanner(System.in);
      System.out.println("Введите число на которое хотите умножить");
      float number = Integer.parseInt(in.nextLine());
      float[][] ourMatrix = new float[matrixStrokCount][matrixStolbCount];
      for (int i = 0; i < matrixStrokCount; i++){
         for (int j = 0; j < matrixStolbCount; j++){
            ourMatrix[i][j] = number*matrixArray[i][j];
         }
      }
      System.out.println("Новая матрица [" + matrixStrokCount + "*" + matrixStolbCount + "]");
      Arrays.stream(ourMatrix).map(Arrays::toString).forEach(System.out::println);
   }
   public void matrixAddition(Matrix B){
      if (matrixStolbCount == B.matrixStolbCount & matrixStrokCount == B.matrixStrokCount){
         float[][] newMatrix = new float[matrixStrokCount][matrixStolbCount];
         for (int i = 0; i < matrixStrokCount; i++){
            for (int j = 0; j < matrixStolbCount; j++){
               newMatrix[i][j] = matrixArray[i][j] + B.matrixArray[i][j];
            }
         }
         System.out.println("Новая матрица [" + matrixStrokCount + "*" + matrixStolbCount + "]");
         Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
      } else System.out.println("ERROR сложение невозможно!");
   }
   public void multi(Matrix B){
      if (matrixStolbCount == B.matrixStrokCount) {
         float[][] newMatrix = new float[matrixStrokCount][B.matrixStolbCount];
         for (int i = 0; i < matrixStrokCount; i++) { // строка A
            for (int j = 0; j < B.matrixStolbCount; j++) { // столбец B
               newMatrix[i][j] = 0;
               for (int k = 0; k < matrixStolbCount; k++) { // столбец A
                  newMatrix[i][j] += matrixArray[i][k] * B.matrixArray[k][j];
               }
            }
         }
         System.out.println("Новая матрица [" + matrixStrokCount + "*" + B.matrixStolbCount + "]");
         Arrays.stream(newMatrix).map(Arrays::toString).forEach(System.out::println);
      } else System.out.println("ERROR умножение невозможно");
   }
}
