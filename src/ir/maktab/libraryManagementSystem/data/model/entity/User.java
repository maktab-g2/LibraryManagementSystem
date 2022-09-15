package ir.maktab.libraryManagementSystem.data.model.entity;

import java.util.Objects;

public abstract class User {
    private int id;
    private String name;
    private Account account;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(account, user.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, account);
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
