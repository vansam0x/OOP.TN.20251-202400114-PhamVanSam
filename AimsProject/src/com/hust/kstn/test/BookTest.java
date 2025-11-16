package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("heart2heart", 2006, "pretty");
        BookAuthor author2 = new BookAuthor("newjeans", 2005, "ditto");
        BookAuthor author3 = new BookAuthor("le sserafirm", 2004, "perfect night");
        BookAuthor author4 = new BookAuthor("I've", 2007, "after like");

        Book book1 = new Book("nuoi con 5 trieu", "day con", 5.0, 36000, author1);
        Book book2 = new Book("flop qua thi ghi ten anh vao", "son tung", 30, 123342, author2, author3, author4);

        System.out.println("Book1 : " + book1);
        System.out.println("Book2 : " + book2);
    }
}
