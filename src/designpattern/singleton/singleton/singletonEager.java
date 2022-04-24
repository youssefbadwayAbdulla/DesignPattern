package designpattern.singleton.singleton;

public class singletonEager {
    private static singletonEager instance = new singletonEager();

    private singletonEager() {
    }

    public synchronized static singletonEager getInstance() {
        return instance;
    }
}
