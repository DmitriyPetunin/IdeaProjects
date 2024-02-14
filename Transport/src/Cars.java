public class Cars extends Transport{
    public int wheels;
    public Cars(int maxSpeed,int placesInTheSalon,int maxTravelTime,int wheels){
        super(maxSpeed,placesInTheSalon,maxTravelTime);
        this.wheels = wheels;
    }
    @Override
    public String moveOn() {
        return "Я передвигаюсь по земле";
    }
}
