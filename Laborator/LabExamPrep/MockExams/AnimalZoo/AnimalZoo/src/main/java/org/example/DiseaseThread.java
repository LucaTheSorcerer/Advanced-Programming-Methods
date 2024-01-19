package org.example;

public class DiseaseThread extends Thread {

    private Animal animal;

    public DiseaseThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        while(true) {
            if("Healthy".equals(animal.getHealthStatus())) {
                try {
                    System.out.println("Disease: Waiting 2 seconds");
                    sleep(2000);
                    System.out.println("Disease: Making animal sick");
                    animal.setHealthStatus("Sick");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
