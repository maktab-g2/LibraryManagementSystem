package ir.maktab.libraryManagementSystem.data.dao;

import ir.maktab.libraryManagementSystem.data.model.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountDataBase {
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }
}
