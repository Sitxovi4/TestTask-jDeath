import com.sitx.spring.HibernateUtil;
import com.sitx.spring.Service;
import com.sitx.spring.dao.DAOImpl.AccountDAOImpl;
import com.sitx.spring.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    public static void main(String[] args) {


//       Query query = session.createQuery("select User.NAME from User join Account on User where User.accounts. ");



//        System.out.println(Service.getBiggestAccount());


    }
}
