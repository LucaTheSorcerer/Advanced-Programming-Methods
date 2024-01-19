package org.example.Observer;

public class Observer1 implements Observer{

    @Override
    public void notifyObserver() {
        System.out.println("Observer1 has been notified");
    }

    @Override
    public String toString() {
        return "Observer1{}";
    }
}
