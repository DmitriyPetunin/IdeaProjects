import java.util.Random;

public class Turtle extends Creature {
    public Turtle(){
        this.name = "Turtle";
    }

    @Override
    public Point move() {
        Random random = new Random();
        int direction = random.nextInt(0, 5);
        if (currentPosition == null) init();
        switch (direction){
            case 0:
                if (currentPosition.getX() == 1000) break;
                currentPosition.setX(currentPosition.getX() + 1); break;
            case 1:
                if (currentPosition.getX() == 1000 | currentPosition.getY() == 0) break;
                currentPosition.setY(currentPosition.getY() - 1);
                currentPosition.setX(currentPosition.getX() + 1);
                break;
            case 2:
                if (currentPosition.getY() == 1000 | currentPosition.getX() == 1000) break;
                currentPosition.setY(currentPosition.getY() + 1);
                currentPosition.setX(currentPosition.getX() + 1);
                break;
            case 3:
                if (currentPosition.getY() == 1000 | currentPosition.getX() == 0) break;
                currentPosition.setY(currentPosition.getY() + 1);
                currentPosition.setX(currentPosition.getX() - 1);
                break;
            case 4:
                if (currentPosition.getY() == 0 | currentPosition.getX() == 0) break;
                currentPosition.setY(currentPosition.getY() - 1);
                currentPosition.setX(currentPosition.getX() - 1);
                break;
        }
        return currentPosition;
    }
}
