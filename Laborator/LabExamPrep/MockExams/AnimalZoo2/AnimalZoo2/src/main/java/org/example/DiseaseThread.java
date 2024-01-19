package org.example;

public class DiseaseThread extends Thread {

    private final Animal animal;

    public DiseaseThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (animal) {
                try {
                    System.out.println("Disease: Waiting 2 seconds");
                    animal.wait(2000); // Wait for 2 seconds
                    System.out.println("Disease: Making animal sick");
                    animal.setHealthStatus("Sick");
                    animal.notify(); // Notify the DoctorThread
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }
}
