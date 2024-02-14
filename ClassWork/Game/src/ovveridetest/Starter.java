package ovveridetest;

public interface Starter {
    void start();
    default void stop(){
        System.out.println("stop all processes");
    }
}
