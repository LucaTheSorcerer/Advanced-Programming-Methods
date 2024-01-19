package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements Observable{

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
        System.out.println(observer + " has been added");

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println(observer + " has been removed");

    }

    @Override
    public void NotifyObservers() {
        for(Observer observer : observerList) {
            observer.notifyObserver();
        }
    }
}
