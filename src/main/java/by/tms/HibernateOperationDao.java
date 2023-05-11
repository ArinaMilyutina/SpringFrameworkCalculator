package by.tms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HibernateOperationDao implements OperationDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void save(Operation operation) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(operation);
    }
}
