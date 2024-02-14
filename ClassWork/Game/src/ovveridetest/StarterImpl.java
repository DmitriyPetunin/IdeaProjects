package ovveridetest;

public class StarterImpl implements Starter {

    public static void main(String[] args) {
        Starter starter = new StarterImpl();
        starter.start();
        starter.stop();
    }
    @Override
    public void start() {
        System.out.println("start");
    }
    @Override
    public void stop() {
        System.out.println("end");
    }
}
