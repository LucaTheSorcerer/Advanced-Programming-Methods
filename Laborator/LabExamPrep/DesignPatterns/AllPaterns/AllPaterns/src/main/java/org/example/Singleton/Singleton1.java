package org.example.Singleton;

public class Singleton1 {

    private static volatile Singleton1 singleton;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if(singleton == null) {
            synchronized (Singleton1.class) {
                if(singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }

}
