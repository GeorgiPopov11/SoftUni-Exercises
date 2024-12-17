package IteratorsAndComparators.Library;

import java.util.Arrays;
import java.util.Iterator;

public class Library implements Iterable<Book>{

    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    public Iterator<Book> iterator(){
        return new BookIterator();
    }

    public class BookIterator implements Iterator<Book> {

        private int index = 0;

        public boolean hasNext() {
            return index < books.length;
        }
        public Book next() {
            Book book = books[index];
            index++;
            return book;
        }
    }

    @Override
    public String toString() {
        return String.format("%s", Arrays.toString(books));
    }
}


