package org.example.Singleton;

public class SingletonMain {

    public static void main(String[] args) throws InterruptedException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Thread thread = new Thread(()-> {
            Singleton singleton3 = Singleton.getInstance();
        });

        thread.start();
        thread.join();


    }
}
