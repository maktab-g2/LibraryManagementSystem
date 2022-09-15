package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryDataBase {
    private List<Book> books = new ArrayList<>();

    public LibraryDataBase() {
        Book book=new Book(12L,"title1","author1","publisher1");
        Book book1=new Book(122L,"title2","author2","publisher2");
        Book book2=new Book(142L,"title3","author3","publisher3");
        Book book3=new Book(152L,"title4","author4","publisher4");
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);

    }

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
