package com.example.CompareExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java Programming", 500));
        bookList.add(new Book("DSA", 800));
        bookList.add(new Book("SQL", 450));

        Collections.sort(bookList, new Book());

        bookList.forEach(b -> System.out.println(b.getTitle() + ": " + b.getPageCount()));

        bookList.stream()
                .sorted(Comparator.comparing(Book::getPageCount))
                .collect(Collectors.toList());

        bookList.forEach(b -> System.out.println(b.getTitle() + ": " + b.getPageCount()));




    }
}
