package Structural.Composite.Boec;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name,author,category;
    private int id;
    private List<Book> listBook;


    public Book(String name, String author, String category, int id) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.id = id;
        this.listBook = new ArrayList<>();
    }

    public void add(Book book){
        listBook.add(book);
    }
    public void remove(Book book){
        listBook.remove(book);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", id=" + id +
                ", listBook=" + listBook +
                '}';
    }


    public List<Book> getListBook() {
        return listBook;
    }
}
