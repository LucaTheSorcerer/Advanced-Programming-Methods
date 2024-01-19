package org.example;

import java.util.ArrayList;

public class StudentThreads {

    private final Object lock = new Object();
    public void monitorCourses(ArrayList<Student> studentArrayList) throws InterruptedException {

        Thread thread1 = new Thread(() -> {

            for(int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    lock.notify();
                    System.out.println("Thread 1 -> New Student addded");
                    studentArrayList.add(new Student(i, i, String.valueOf(i),i, String.valueOf(i)));
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }

        },"Thread 1");



        Thread thread2 = new Thread(() -> {

            for(int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread 2 -> New Student validated");
                    lock.notify();
                }
            }

        },"Thread 2");

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();

    }
}
