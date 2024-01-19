package org.example;

public class DoctorThread extends Thread{
    private Animal animal;

    public DoctorThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        while(true) {
            if ("Sick".equals(animal.getHealthStatus())) {
                System.out.println("Doctor: Healing Animal");
                animal.setHealthStatus("Healthy");
            }
        }
    }
}
