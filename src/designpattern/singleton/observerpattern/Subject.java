package designpattern.singleton.observerpattern;

public interface Subject {
    void registerObserver(CurrentConditionsDisplay o);
    void removeObserver(Observer o);
    void notifyObserver();

}
