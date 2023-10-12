package org.example.Movie;

public class ArraySorter {

    private Sorter sorter;

    public ArraySorter() {
        this.sorter = sorter;
    }

    public void sort(int[] arr) {
        sorter.sort(arr);
    }

    public void setSortingStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public void sortArray(int[] arr) {
        sorter.sort(arr);
    }
}
