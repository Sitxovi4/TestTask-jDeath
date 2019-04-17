package com.sitx.spring.dao.DAO;

import com.sitx.spring.model.Account;
import com.sitx.spring.model.User;

import java.util.List;

public interface AccountDAO {


    List<Account> getAllAccounts();

    Object getUserIdWithBiggestAccount();

    int getAccountsSum();
}
