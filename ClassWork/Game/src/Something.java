public class Something extends Creature{

    public Something(){
        this.name = "Something";
    }
    public Point move(){
        currentPosition = new Point((int) (Math.random() * 1000),(int) (Math.random() * 1000));
        return currentPosition;
    }
}
