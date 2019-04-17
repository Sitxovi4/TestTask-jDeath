package com.sitx.spring;

import com.sitx.spring.dao.DAOImpl.AccountDAOImpl;
import com.sitx.spring.dao.DAOImpl.UserDAOImpl;
import com.sitx.spring.model.Account;
import com.sitx.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Comparator;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private AccountDAOImpl accountDAOImpl;
    private UserDAOImpl userDAOImpl;

    @Autowired
    public Service(AccountDAOImpl accountDAOImpl, UserDAOImpl userDAOImpl) {
        this.accountDAOImpl = accountDAOImpl;
        this.userDAOImpl = userDAOImpl;
    }

    public Object getRichestUser(){
        return userDAOImpl.getRichestUser(accountDAOImpl.getUserIdWithBiggestAccount());

    }


}
