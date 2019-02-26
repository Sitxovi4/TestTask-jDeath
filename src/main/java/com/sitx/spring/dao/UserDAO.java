package com.sitx.spring.dao;

import com.sitx.spring.model.User;


import java.util.List;

public interface UserDAO {

    User getRichestUser();
    int getAccountsSum();
    List<User> getAllUsers();
}
