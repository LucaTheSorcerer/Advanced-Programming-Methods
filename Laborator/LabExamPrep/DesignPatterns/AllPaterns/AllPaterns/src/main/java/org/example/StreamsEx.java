package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsEx {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5 ,6 ,7 ,8, 9);

        List<Integer> ll = l.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        ll.forEach(x -> System.out.println(x));

//        List<Integer> integerList = IntStream.range(1, 10)
//                .filter( i -> i % 2 != 0)
//                .peek(i -> System.out.println("Number is: " + i))
//                .map( i -> i * 10)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(integerList);

        List<Integer> integerList1 = Stream.of(0, 1, 2)
                .flatMap(i -> range(10*i, 10*i+10))
                .collect(Collectors.toList());

        System.out.println(integerList1);


        List<Integer> integerList2 =
                Stream.of(9, 0, 3, 1, 7 ,3, 4, 7, 2, 8, 5, 0, 6, 2)
                        .distinct()
                        .sorted((i, j) -> i - j)
                        .skip(1)
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(integerList2);

        Map<Boolean, List<Integer>> oddAndEven =
                Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
                        .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(oddAndEven);

        Map<Integer, List<Integer>> groupedByMod3 =
                Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
                        .collect(Collectors.groupingBy(x -> x % 3));

        System.out.println(groupedByMod3);

        Map<Integer, List<String>> groupedByLength =
                Stream.of("one", "two", "five", "eigth")
                        .collect(Collectors.groupingBy(x -> x.length()));

        System.out.println(groupedByLength);

        Map<Integer, Long> countGroupsByLength =
                Stream.of("one", "two", "five", "eigth")
                        .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(countGroupsByLength);

    }

    static Stream<Integer> range(int from, int to) {
        return IntStream.range(from, to).boxed();
    }
}
