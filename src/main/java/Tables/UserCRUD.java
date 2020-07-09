package Tables;
import ValAndDb.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserCRUD
{
    public void saveUser(User user)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        session.getSessionFactory().close();
    }

    public static List<User>getAll()
    {
        List<User>list_users;
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list_users=session.createQuery("from User").getResultList();
        session.getTransaction().commit();
        session.close();
        session.getSessionFactory().close();
        return list_users;
    }

    public static User getUser(String username)
    {
        User user=new User();
        List<User>list_users=getAll();
        for(User user1:list_users) { if(user1.getUsername().equals(username)) user=user1; }
        return user;
    }

    public static void updateUser(User user)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
        session.getSessionFactory().close();
    }
}