package IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book bookOne = new Book("Book one", 1995, "John", "Wayne");
        Book bookTwo = new Book("Book two", 1996, "Josh", "Wick");
        Book bookThree = new Book("Book three", 1997, "Bruce", "Willis");

        List<Book> booksList = new ArrayList<>();
        booksList.add(bookOne);
        booksList.add(bookTwo);
        booksList.add(bookThree);

        for (Book book : booksList) {
            System.out.printf(book.getAuthors().toString());
        }
    }
}
