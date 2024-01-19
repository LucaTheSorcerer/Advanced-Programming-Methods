package org.example;

import java.io.IOException;

public class AnimalThread {

    private final Object lock = new Object();
    public void monitorAnimals(Animal animal) throws InterruptedException {

        Thread doctorThread = new Thread(() -> {

            while(true) {
                try {
                    synchronized (lock) {
                        System.out.println("Doctor healing animal");
                        animal.setHealthStatus("Healthy");
                        lock.wait();
                        lock.notify();


                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        },"Doctor");


        Thread diseaseThread = new Thread(() -> {

            while(true) {
                try {
                    synchronized (lock) {
                        Thread.sleep(2000);
                        lock.notify();
                        System.out.println("Disease making animal sick");
                        animal.setHealthStatus("Sick");
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        },"Disease");

        doctorThread.start();
        diseaseThread.start();

        doctorThread.join();
        diseaseThread.join();

    }
}
