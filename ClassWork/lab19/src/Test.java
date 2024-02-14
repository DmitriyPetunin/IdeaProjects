public class Test {
    enum CoinColor { COPPER, NICKEL, SILVER }


    enum Coin {
        PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
        Coin(int value) { this.value = value; }
        private final int value;
        public int value() { return value; }
    }

    static CoinColor color(Coin c) {
        switch (c) {
            case PENNY:
                return CoinColor.COPPER;
            case NICKEL:
                return CoinColor.NICKEL;
            case DIME:

            case QUARTER:
                return CoinColor.SILVER;
            default:
                System.out.println("Unknown coin: " + c);
                return null;
        }
    }
    public static void main(String[] args) {
        for (Coin c : Coin.values())
            System.out.println(c + "\t\t" +
                    c.value() + "\t" + color(c));
    }
}
