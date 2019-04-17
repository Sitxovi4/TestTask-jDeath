package com.sitx.spring.dao.DAOImpl;

import com.sitx.spring.HibernateUtil;
import com.sitx.spring.dao.DAO.AccountDAO;
import com.sitx.spring.model.Account;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDAOImpl implements AccountDAO {

    private Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Account> getAllAccounts() {
        return session.createQuery("from Account ").list();
    }

    @Override
    public Object getUserIdWithBiggestAccount(){
        Query query = session.createSQLQuery("select userId from account where account = (select max(account) from userbank.account)");
        return query.getSingleResult();
    }

    @Override
    public int getAccountsSum() {
        int sum = 0;
        try {
            session.beginTransaction();

            List<Account> accontsList = session.createQuery("from Account ").list();
            for (Account account : accontsList){
                sum+= account.getAccount();
            }

            session.getTransaction().commit();
        }catch (Exception ex){
            session.getTransaction().rollback();
            ex.printStackTrace();
        }



        return sum;
    }
}
