package IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String tittle;
    private int year;
    private List<String> authors;

    public Book(String tittle, int year, String... authors) {
        this.tittle = tittle;
        this.year = year;
        setAuthors(authors);
    }

    public String getTittle(){
        return this.tittle;
    }
    public int getYear(){
        return this.year;
    }
    public List<String> getAuthors() {
        return this.authors;
    }

    private void setTittle(String tittle){
        this.tittle = tittle;
    }
    private void setYear(int year){
        this.year = year;
    }
    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);

        }
    }

}
