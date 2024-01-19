package org.example.Observer;

public class ObserverMain {

    public static void main(String[] args) {

        Schedule schedule = new Schedule();

        Observer1 observer1 = new Observer1();

        schedule.addObserver(observer1);

        schedule.NotifyObservers();
    }
}
