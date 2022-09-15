package ir.maktab.libraryManagementSystem.data.model.entity;

import java.util.Objects;

public class Librarian {
    private int id;
    private String name;
    private String password;
    private String searchString;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Librarian librarian = (Librarian) o;
        return id == librarian.id && Objects.equals(name, librarian.name) && Objects.equals(password, librarian.password) && Objects.equals(searchString, librarian.searchString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, searchString);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", searchString='" + searchString + '\'' +
                '}';
    }
}
