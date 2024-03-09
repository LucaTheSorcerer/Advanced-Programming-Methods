package com.example.CompareExamples;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java", 123);
        Book book2 = new Book("Java", 456);

        System.out.println(addTwoBooks(book1, book2, (a, b) -> a.getPageCount() + a.getPageCount()));
    }

    public static Integer addTwoBooks(Book book1, Book book2, AddBooks<Integer, Book> f) {
       return f.addBooks(book1, book2);
    }
}