import java.util.Random;

public class Сaterpillar extends Creature{

    public Сaterpillar(){
        this.name = "Сaterpillar";
    }

    @Override
    public Point move() {
        Random random = new Random();
        int direction = random.nextInt(0, 3);
        if (currentPosition == null) init();
        switch (direction){
            case 0:
                if (currentPosition.getY() == 0) break;
                currentPosition.setY(currentPosition.getY() - 1); break;
            case 1:
                if (currentPosition.getX() == 1000) break;
                currentPosition.setX(currentPosition.getX() + 1); break;
            case 2:
                if (currentPosition.getY() == 1000) break;
                currentPosition.setY(currentPosition.getY() + 1); break;
        }
        return currentPosition;
    }
}
