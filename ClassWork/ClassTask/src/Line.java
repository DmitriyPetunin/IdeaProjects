import java.util.Scanner;

public class Line {
    float a;
    float b;
    float c;

    void setLine(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString(){
        return a + "*x + " + b + "*y + " + c;
    }
    public static Line readfrom(){
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        Line line = new Line();
        line.setLine(a,b,c);
        return line;
    }
}
