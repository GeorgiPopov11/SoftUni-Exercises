package IteratorsAndComparators.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book bookOne = new Book("John Wick", 1995, "George");
        Book bookTwo = new Book("John Stones",1994, "Johnny");
        Book bookThree = new Book("Steve Austin", 1992, "Triple H");

        Library library = new Library(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTittle());
        }


    }
}
