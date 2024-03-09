package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx<T> implements Consumer<List<T>> {

    private Consumer<T> action;

    public ConsumerEx(Consumer<T> action) {
        this.action = action;
    }

    @Override
    public void accept(List<T> l) {
        for(T x : l) {
            action.accept(x);
        }
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ConsumerEx<Integer> worker =
                new ConsumerEx<>( (i) -> System.out.println(i * 10));
        worker.accept(l);
    }
}
