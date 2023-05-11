package by.tms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


//import java.util.List;
@Service
public class HibernateUserDao implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;
    private static final String FIND_BY_USERNAME ="from User where username = :username";
    private static final String USERNAME="username";

    @Transactional
    @Override
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
    @Override
    public Optional<User> findByUsername(String username) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery(FIND_BY_USERNAME, User.class);
        query.setParameter(USERNAME, username);
        User singleResult = query.getSingleResult();
        return Optional.of(singleResult);
    }
}
