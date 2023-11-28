package org.example;

import java.util.ArrayList;
import java.util.List;

public class MatrixOperations {

    public static List<List<Integer>> addMatrices(List<List<Integer>> matrixA, List<List<Integer>> matrixB) {
        int rows = matrixA.size();
        int cols = matrixA.get(0).size();

        List<List<Integer>> result = new ArrayList<>(rows);

        for(int i = 0; i < rows; i++) {
            result.add(new ArrayList<>(cols));
        }

        List<Thread> threads = new ArrayList<>();

        for(int i = 0; i < rows; i ++) {
            Thread thread = new MatrixAdditionThread(matrixA.get(i), matrixB.get(i), result.get(i));
            threads.add(thread);
            thread.start();
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new InterruptedException(e);
            }
        }
        return result;
    }



}
