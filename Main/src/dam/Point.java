package dam;
public class Point {

    double x;
    double y;

    public void setPoint(double x, double y){
        this.x = x; // this - ссылка на текущий экз класса!
        this.y = y;
    }
    public String toString() {
        return "(X = " + x + ", y = " + y + ")";
    }
}
