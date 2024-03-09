package com.example.ThreadExamples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadRunnableEx {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
//        Runnable myRunnable = () -> {
//            lock.lock();
//            try {
//                for(int i = 1; i <= 5; i++) {
//                    System.out.println("Runnable: " + i);
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//        };
//
//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//
//        thread1.start();
//        thread2.start();


        MyRunnableEx myRunnableEx = new MyRunnableEx();

        Thread thread3 = new Thread(myRunnableEx, "Thread3");
        Thread thread4 = new Thread(myRunnableEx, "Thread4");
        thread3.start();
        thread4.start();


        Thread thread5 = new Thread(new Runnable() {


            @Override
            public void run() {

            }
        });

        thread5.start();
    }
}
