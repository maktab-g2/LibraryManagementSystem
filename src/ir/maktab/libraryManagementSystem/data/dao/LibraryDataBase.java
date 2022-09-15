package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryDataBase {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public Book BorrowBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }
}
