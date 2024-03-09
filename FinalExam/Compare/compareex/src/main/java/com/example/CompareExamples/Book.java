package com.example.CompareExamples;

import java.util.Comparator;

public class Book implements Comparator<Book> {

    private String title;
    private int pageCount;

    public Book() {
    }

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPageCount(), o2.getPageCount());
    }
}
