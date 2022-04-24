package designpattern.singleton.singleton;

public class singletonSync {
    private static singletonSync instance;

    //thread is safe
    private singletonSync() {
    }

    public synchronized static singletonSync getInstance() {
        if (instance == null) {
            instance = new singletonSync();
        }
        return instance;
    }
}
