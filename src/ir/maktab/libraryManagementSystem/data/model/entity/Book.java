package ir.maktab.libraryManagementSystem.data.model.entity;

import java.util.Objects;

public class Book {
    private long isbn;
    private String title;
    private String Author;
    private String publication;

    public Book() {
    }

    public Book(long isbn, String title, String author, String publication) {
        this.isbn = isbn;
        this.title = title;
        Author = author;
        this.publication = publication;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(Author, book.Author) && Objects.equals(publication, book.publication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, Author, publication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", publication='" + publication + '\'' +
                '}';
    }
}
