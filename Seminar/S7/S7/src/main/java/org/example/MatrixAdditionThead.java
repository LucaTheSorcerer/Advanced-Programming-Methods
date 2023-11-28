package org.example;

import java.util.List;

public class MatrixAdditionThead extends Thread{

    private List<Integer> rows;
    private List<Integer> columns;
    private List<Integer> result;

    public MatrixAdditionThead(List<Integer> rows, List<Integer> columns) {
        this.rows = rows;
        this.columns = columns;
    }
}
