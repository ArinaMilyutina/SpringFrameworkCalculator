package by.tms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class HibernateUserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }

//    public User findById(long id) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        return currentSession.get(User.class, id);
//    }

//    public List<User> findAll() {
//        Session currentSession = sessionFactory.getCurrentSession();
//        List<User> fromUser = currentSession.createQuery("from User", User.class).getResultList();
//        return fromUser;
//    }
//
//    public User findByUsername(String username) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        Query<User> query = currentSession.createQuery("from User where username = :username", User.class);
//        query.setParameter("username", username);
//        User singleResult = query.getSingleResult();
//        return singleResult;
//    }
}
