public abstract class Creature implements IPrintable, IPositionable{
    protected String name;

    protected Point currentPosition;
    public void init(){
        currentPosition = new Point((int) (Math.random() * 1000),(int) (Math.random() * 1000));
    }
    public abstract Point move();
    public void print() {
        System.out.println(name + " - " + currentPosition);
    }
}
