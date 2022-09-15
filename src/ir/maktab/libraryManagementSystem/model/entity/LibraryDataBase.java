package ir.maktab.libraryManagementSystem.model.entity;

import java.util.List;

public class LibraryDataBase {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "LibraryDataBase{" +
                "books=" + books +
                '}';
    }
}
