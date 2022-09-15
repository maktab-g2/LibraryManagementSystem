package ir.maktab.libraryManagementSystem.service;

import ir.maktab.libraryManagementSystem.data.dao.LibraryDataBase;
import ir.maktab.libraryManagementSystem.data.dao.UserDao;
import ir.maktab.libraryManagementSystem.data.model.entity.Book;
import ir.maktab.libraryManagementSystem.data.model.entity.User;

public class AccountService {

    UserDao userDao = UserDao.getInstance();

    public void register(User user) {
        userDao.getUsers().add(user);
    }

    public User logIn(String username, String password) {
        return userDao.getUserByUsernameAndPassword(username, password);
    }

}
