package com.sitx.spring.dao.DAOImpl;

import com.sitx.spring.HibernateUtil;
import com.sitx.spring.dao.DAO.UserDAO;
import com.sitx.spring.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    private Session session = HibernateUtil.getSessionFactory().openSession();



    @Override
    public User getRichestUser(Object userId) {
        Query query = session.createQuery("from User  where userId = :userId");
        query.setParameter("userId", userId);
        return (User) query.getSingleResult();
    }



    @Override
    public List<User> getAllUsers() {
        return session.createQuery("from User ").list();
    }
}
