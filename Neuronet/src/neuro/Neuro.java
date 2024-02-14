package neuro;

public class Neuro {
    public double[][] w;
    public double[] v;
    private int countNodes;

    public void setCountNodes(int countNodes) {
        this.countNodes = countNodes;
    }

    public void setWeight(double[][] w, double[] v) {
        this.w = w;
        this.v = v;
    }

    public double calculate(double[] x) {
        double[] nodeValues = new double[countNodes];
        for (int i = 0; i < countNodes; ++i) {
            double sum = 0;
            for (int j = 0; j < x.length; ++j) {
                sum += x[j] * w[j][i];
            }

            nodeValues[i] = sigma(sum);
        }

        double result = 0;

        for (int i = 0; i < countNodes; ++i) {
            result += nodeValues[i]*v[i];
        }

        return sigma(result);
    }

    private double sigma(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    public double targetFunction(double x[][], double[] y) {
        int n = y.length;
        double sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += (y[i] - calculate(x[i])) * (y[i] - calculate(x[i]));
        }
        sum /= n;

        return sum;
    }
}