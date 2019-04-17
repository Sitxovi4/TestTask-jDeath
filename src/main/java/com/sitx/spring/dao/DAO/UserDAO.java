
package com.sitx.spring.dao.DAO;

import com.sitx.spring.model.User;


import java.util.List;

public interface UserDAO {

    User getRichestUser(Object object);
    List<User> getAllUsers();
}