package org.example;

import java.util.ArrayList;

public class CoursesThreads {

    private static final Object lock = new Object();
    public static void monitorCourses(ArrayList<Student> studentArrayList) throws InterruptedException {

        Thread thread1 = new Thread(() -> {

            for(int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    lock.notify();
                    System.out.println(Thread.currentThread().getName() + "added student to course");
                    studentArrayList.add(new Student(i, i, String.valueOf(i), i, String.valueOf(i)));
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        },"Thread1");

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "Check for registration validation");
                    System.out.println();

                    lock.notify();
                }
            }

        }, "Thread2");

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();
    }
}
