package designpattern.singleton.singleton;

public class Singleton {
    private static Singleton instance;

    //thead is not safe
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}