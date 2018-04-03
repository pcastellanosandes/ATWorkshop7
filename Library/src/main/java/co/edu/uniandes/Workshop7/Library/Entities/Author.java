package co.edu.uniandes.Workshop7.Library.Entities;

import java.util.LinkedList;
import java.util.List;

public class Author {
    private int id;
    private String name;
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        if(books ==null)
            books = new LinkedList<>();
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setBook (Book book){
        if(this.books ==null)
            this.books = new LinkedList<>();
        this.books.add(book);
    }



}
