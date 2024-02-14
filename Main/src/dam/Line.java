package dam;
public class Line {
    double a;
    double b;
    double c;
    public void setLine(double a, double b, double c) {
        this.a = a; // член класса dam.Line принимает значение аргумента a метода setLine
        this.b = b;
        this.c = c;
    }
    public String toString() {
        return a + "*x + " + b + "*y + " + c;
    }
}
