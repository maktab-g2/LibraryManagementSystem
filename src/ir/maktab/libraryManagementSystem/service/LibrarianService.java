package ir.maktab.libraryManagementSystem.service;

import ir.maktab.libraryManagementSystem.data.dao.LibraryDataBase;
import ir.maktab.libraryManagementSystem.data.model.entity.Book;
import ir.maktab.libraryManagementSystem.data.model.entity.User;

public class LibrarianService {
    LibraryDataBase libraryDataBase = new LibraryDataBase();

    public boolean borrowedBook(String bookTitle, User user) {
        Book book = libraryDataBase.BorrowBook(bookTitle);
        if (book == null)
            return false;
        if (user.getAccount().getNumberOfBorrowedBooks().size() > 4) {
            ReservedBooks(book, user);
            return false;
        }
        user.getAccount().getNumberOfBorrowedBooks().add(book);
        return true;
    }


    public void ReservedBooks(Book book, User user) {

        user.getAccount().getNumberOfReservedBooks().add(book);
    }

    public boolean ReturnBooks(String bookTitle, User user) {
        for (Book book : user.getAccount().getNumberOfBorrowedBooks()) {
            if (book.getTitle().equals(bookTitle)) {
                user.getAccount().getNumberOfBorrowedBooks().remove(book);
                libraryDataBase.getBooks().add(book);
                return true;
            }
        }
        return false;
    }

    public boolean LostBooks(String bookTitle, User user) {
        for (Book book : user.getAccount().getNumberOfBorrowedBooks()) {
            if (book.getTitle().equals(bookTitle)) {
                user.getAccount().getNumberOfBorrowedBooks().remove(book);
                user.getAccount().getNumberOfLostBooks().add(book);
                user.getAccount().setFineAmount(200000);
                return true;
            }
        }
        return false;
    }

    public double ShowFineAmount(User user) {
        return user.getAccount().getFineAmount();
    }


}


