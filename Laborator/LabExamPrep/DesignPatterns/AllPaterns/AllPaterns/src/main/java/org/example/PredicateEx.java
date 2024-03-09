package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    static <T> List<T> filterList(List<T> l, Predicate<T> pred) {
        List<T> res = new LinkedList<>();
        for(T x : l) {
            if(pred.test(x)) {
                res.add(x);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(filterList(
                l,
                (x) -> x % 2 == 0
        ));

    }
}
