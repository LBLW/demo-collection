package base.demo.oob.dp.observer;

public interface Subject {

    boolean registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObserver();
}
