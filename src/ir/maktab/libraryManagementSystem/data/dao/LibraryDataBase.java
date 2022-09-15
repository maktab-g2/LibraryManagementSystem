package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryDataBase {
    private List<Book> books = new ArrayList<>();
    public List<Book> getBooks() {
        return books;
    }

}
