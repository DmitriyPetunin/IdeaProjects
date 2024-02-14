import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String[] str = reader.readLine().split(" ");
        int tariffCost = Integer.parseInt(str[0]);
        int tariffSize = Integer.parseInt(str[1]);
        int priceMB = Integer.parseInt(str[2]);
        int nextMonth = Integer.parseInt(str[3]);
        reader.close();

        if (nextMonth <= tariffSize) {
            System.out.println(tariffCost);
        } else {
            System.out.println(tariffCost + ((nextMonth - tariffSize) * priceMB));
        }
    }
}