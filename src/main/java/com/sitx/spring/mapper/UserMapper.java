package com.sitx.spring.mapper;

import com.sitx.spring.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setID(resultSet.getInt("userId"));
        user.setNAME(resultSet.getString("name"));
        user.setSURNAME(resultSet.getString("surName"));
        user.setACCOUNT(resultSet.getInt("account"));
        return user;
    }
}
