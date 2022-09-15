package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Account;
import ir.maktab.libraryManagementSystem.data.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static UserDao instance;

    private UserDao() {
    }

    public static UserDao getInstance() {
        if (instance == null)
            return new UserDao();
        return instance;
    }

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        for (User user : users) {
            if (user.getAccount().getUsername().equals(username) &&
                    user.getAccount().getPassword().equals(password))
                return user;
        }
        return null;
    }
}
