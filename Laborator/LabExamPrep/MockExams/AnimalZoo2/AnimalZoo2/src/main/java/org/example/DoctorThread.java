package org.example;

public class DoctorThread extends Thread{

    private final Animal animal;

    public DoctorThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (animal) {
                try {
                    if("Sick".equals(animal.getHealthStatus()))
                    {
                        System.out.println("Doctor: Healing animal");
                        animal.setHealthStatus("Healthy");
                        animal.notify();
                    }

                        animal.wait();
                } catch (InterruptedException e) {
                throw new RuntimeException(e);
                }
            }
        }
    }
}
