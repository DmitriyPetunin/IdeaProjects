import dam.Line;
import dam.Point;

public class Main {
    public static void main(String[] args) {
        Point a = new Point();
        a.setPoint(1.0,2.0);

        Line line = new Line();
        line.setLine(2.0,3.0,5.0);

        System.out.println(a.toString());

        System.out.println(line.toString());
    }
}