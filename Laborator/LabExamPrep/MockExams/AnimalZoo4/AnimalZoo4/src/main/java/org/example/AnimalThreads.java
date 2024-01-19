package org.example;

public class AnimalThreads {

    private static final Object lock = new Object();

    public static void animalMonitor(Animal animal) throws InterruptedException {

        Thread doctorThread = new Thread(() -> {

            while(true) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Doctor Healing animal: " + animal.getName());
                    animal.setHealthStatus("Healthy");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        },"Doctor Thread");

        Thread diseaseThread = new Thread(() -> {
            while(true) {
                synchronized (lock) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Disease making animal + " +  animal.getName() + " sick" );
                    animal.setHealthStatus("Sick");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


        }, "Disease Thread");

        diseaseThread.start();
        doctorThread.start();

        doctorThread.join();
        diseaseThread.join();

    }
}
