package neuro;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WeightReader {

    public double[][] getX() {
        String[] strX = loadTextAsStringFromFile("xdata.csv","utf8");
        double[][] x = new double[strX.length][2];

        for (int i = 0; i < x.length; ++i) {
            x[i][0] = Double.parseDouble(strX[i].split(";")[0]);
            x[i][1] = Double.parseDouble(strX[i].split(";")[1]);
        }
        return x;
    }

    public double[] getY() {
        String[] strY = loadTextAsStringFromFile("ydata05.csv","utf8");
        double[] y = new double[strY.length];

        for (int i = 0; i < y.length; ++i) {
            y[i] = Double.parseDouble(strY[i]);
        }

        return y;
    }
    public static String[] loadTextAsStringFromFile(String path, String encoding) {
        String[] result;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName(encoding));
            result = new String[lines.size()];
            for(int i = 0; i < result.length; ++i) {
                result[i] = lines.get(i);
            }
            return result;
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }
}