package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Account;
import ir.maktab.libraryManagementSystem.data.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
}
