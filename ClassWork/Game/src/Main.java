public class Main {

    private Creature[] creatures;
    private void initGame(){
        creatures = new Creature[3];
        //creatures[0] = new Something();
        creatures[0] = new Ant();
        creatures[1] = new Turtle();
        creatures[2] = new Сaterpillar();
        for (Creature c : creatures){
            c.init();
        }
    }
    private void startGame(){
        boolean flag = true;
        while (flag){
            for (Creature c : creatures){
                c.print();
                Point p = c.move();
                if (inSquare(p)){
                    c.print();
                    flag = false;
                    break;
                }
            }
        }
    }

    private boolean inSquare(Point p){
        return ((p.getX() > 400 & p.getX() < 600) & (p.getY() < 600) & p.getY() > 400);
    }
    public static void main(String[] args) {
        int[][] a = new int[1000][1000]; // задано игровое поле
        Main main = new Main();
        main.initGame();
        main.startGame();
    }
}