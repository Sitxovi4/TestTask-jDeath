package com.sitx.spring.dao.daoimp;

import com.sitx.spring.dao.UserDAO;
import com.sitx.spring.dao.mapper.UserMapper;
import com.sitx.spring.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.List;


@Component
public class UserDAOImp implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAOImp(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public User getRichestUser() {
        String sql = "SELECT user.userId, name, surName, account  FROM user JOIN account a on user.userId = a.userId WHERE account = (SELECT MAX(account) from account) ";
        return  jdbcTemplate.queryForObject(sql, new UserMapper());
    }

    @Override
    public int getAccountsSum() {
        String sql = "select sum(account) from user join account  on user.userId = account.userId";

        return  jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user JOIN account a on user.userId = a.userId";
        return jdbcTemplate.query(sql, new UserMapper());

    }
}
