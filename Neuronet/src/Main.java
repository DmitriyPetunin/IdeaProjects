import neuro.Neuro;
import neuro.WeightReader;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Neuro neuro = new Neuro();

        neuro.setCountNodes(3);

        neuro.setWeight(new double[][]{{0.05, 0.05, 0.05},{0.05, 0.05, 0.05}}, new double[]{0.1, 0.1, 0.1});
        System.out.println(Arrays.deepToString(neuro.w));
        System.out.println(Arrays.toString(neuro.v));

        WeightReader reader = new WeightReader();

        double[][] x = reader.getX();
        double[] y = reader.getY();

        double error = neuro.targetFunction(x, y);

        System.out.println("error = " + error);
    }
}