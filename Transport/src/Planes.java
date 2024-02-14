public class Planes extends Transport{
    public Planes(int maxSpeed, int placesInTheSalon, int maxTravelTime){
        super(maxSpeed,placesInTheSalon,maxTravelTime);

    }
    @Override
    public String moveOn(){
        return "Я передвигаюсь по воздуху";
    }
}
