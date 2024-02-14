import java.util.Scanner;

public abstract class Transport{
    public int maxSpeed;
    public int placesInTheSalon;
    public int maxTravelTime;
    public Transport(int maxSpeed,int placesInTheSalon,int maxTravelTime){
        this.maxSpeed = maxSpeed;
        this.placesInTheSalon = placesInTheSalon;
        this.maxTravelTime = maxTravelTime;
    }
    public String kiberMoveAtoB(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Путь в км :");
        double way = scanner.nextDouble();
        double hours = way/maxSpeed;
        double minutes = (hours - (int)hours) * 60;
        String seconds = String.format("%.2f", (minutes - (int)minutes) * 60);
        return "Вы потратите - " + (int)hours  + " часа " +(int)minutes + " минут " + seconds + " секунд";
    }
    public String moveOn(){
        return "Я передвигаюсь на ...";
    }
}
