import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Line line1 = new Line();
        //line1.setLine(2.0f, 6.0f,9.0f);
        //Line line2 = new Line();
        //line2.setLine(1.0f, 5.0f,17.0f);
        System.out.println("Введите коэффиценты первой прямой:");
        Line line1 = Line.readfrom();
        System.out.println(line1);
        System.out.println("Введите коэффиценты второй прямой:");
        Line line2 = Line.readfrom();
        System.out.println(line2);
        System.out.print("Точка пересечения : ");
        System.out.print(Point_inter(line1, line2));
    }
    static Point Point_inter(Line line1, Line line2) {
        float y = (-line2.c*line1.a + line1.c*line2.a) / (-line1.b*line2.a + line2.b*line1.a);
        float x = (-line2.c*line1.b + line1.c*line2.b) / (-line1.a*line2.b + line2.a*line1.b);
        Point p = new Point();
        p.setPoint(x, y);
        return p;
    }
}