public class Trains extends Transport{
    public String name;
    public Trains(int maxSpeed,int placesInTheSalon,int maxTravelTime, String name){
        super(maxSpeed,placesInTheSalon,maxTravelTime);
        this.name = name;
    }
    @Override
    public String moveOn(){
        return "Я передвигаюсь по рельсам";
    }
}
