package org.example;

import java.util.List;

public class Statistics {
    private List<Integer> numbers;
    private int sum = 0;
    private int max = Integer.MIN_VALUE;

    public Statistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void computeSum() {
        int mid = numbers.size() / 2;
        Thread sumThread1 = new Thread(() -> {
            for(int i = 0; i < mid; i++) {
                sum += numbers.get(i);
            }
        });

        Thread sumThread2 = new Thread(() -> {
            for(int i = mid; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
        });

        sumThread1.start();
        sumThread2.start();

        try {
            sumThread1.join();
            sumThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum: " + sum);
    }

    public void computeProduct() {
        int mid = numbers.size() / 2;
        Thread maxThread1 = new Thread(() -> {
            for(int i = 0; i < mid; i++) {
                max = Math.max(max, numbers.get(i));
            }
        });

        Thread maxThread2 = new Thread(() -> {
            for(int i = mid; i < numbers.size(); i++) {
                max = Math.max(max, numbers.get(i));
            }
        });

        maxThread1.start();
        maxThread2.start();

        try {
            maxThread1.join();
            maxThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Max: " + max);
    }
}
