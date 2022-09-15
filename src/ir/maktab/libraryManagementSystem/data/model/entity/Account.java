package ir.maktab.libraryManagementSystem.data.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private String username;
    private String password;
    private List<Book> numberOfBorrowedBooks = new ArrayList<>();
    private List<Book> numberOfReservedBooks = new ArrayList<>();
    private List<Book> numberOfReturnBooks = new ArrayList<>();
    private List<Book> numberOfLostBooks = new ArrayList<>();
    private double fineAmount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setNumberOfBorrowedBooks(List<Book> numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    public List<Book> getNumberOfReservedBooks() {
        return numberOfReservedBooks;
    }

    public void setNumberOfReservedBooks(List<Book> numberOfReservedBooks) {
        this.numberOfReservedBooks = numberOfReservedBooks;
    }

    public List<Book> getNumberOfReturnBooks() {
        return numberOfReturnBooks;
    }

    public void setNumberOfReturnBooks(List<Book> numberOfReturnBooks) {
        this.numberOfReturnBooks = numberOfReturnBooks;
    }

    public List<Book> getNumberOfLostBooks() {
        return numberOfLostBooks;
    }

    public void setNumberOfLostBooks(List<Book> numberOfLostBooks) {
        this.numberOfLostBooks = numberOfLostBooks;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.fineAmount, fineAmount) == 0 && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(numberOfBorrowedBooks, account.numberOfBorrowedBooks) && Objects.equals(numberOfReservedBooks, account.numberOfReservedBooks) && Objects.equals(numberOfReturnBooks, account.numberOfReturnBooks) && Objects.equals(numberOfLostBooks, account.numberOfLostBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, numberOfBorrowedBooks, numberOfReservedBooks, numberOfReturnBooks, numberOfLostBooks, fineAmount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", numberOfBorrowedBooks=" + numberOfBorrowedBooks +
                ", numberOfReservedBooks=" + numberOfReservedBooks +
                ", numberOfReturnBooks=" + numberOfReturnBooks +
                ", numberOfLostBooks=" + numberOfLostBooks +
                ", fineAmount=" + fineAmount +
                '}';
    }
}
