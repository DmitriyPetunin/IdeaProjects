public class Main {

    enum Colors{
        Red,
        Green,
        Yellow
    }
    enum Currency{
        USD(92),
        EUR(98);
        float value;

        Currency(float value){
            this.value = value;
        }
    }
    public static void main(String[] args) {

        Colors colors = Colors.Green;

        System.out.println(colors);

        for(Colors c : Colors.values()){
            System.out.println(c);
        }
        for (Currency c: Currency.values()){
            System.out.println(c.value);
        }
    }
}