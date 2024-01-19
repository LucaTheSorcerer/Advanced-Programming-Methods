package org.example;

public class AnimalThreads {

    private final Object lock = new Object();

    public void animalMonitor(Animal animal) throws InterruptedException {

        Thread doctorThread = new Thread(() -> {

            while(true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Doctor healing animal " + animal.getName());
                    animal.setHealthStatus("Healthy");
                    lock.notify();

                }

            }
        }, "Doctor Thread");

        Thread diseaseThread = new Thread(() -> {
            while(true) {
                synchronized (lock) {
                    lock.notify();

                    System.out.println("Disease making animal sick " + animal.getName());
                    animal.setHealthStatus("Sick");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }

        }, "Disease Thread");

        doctorThread.start();
        diseaseThread.start();

        diseaseThread.join();
        doctorThread.join();
    }
}
