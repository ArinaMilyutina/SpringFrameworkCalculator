package by.tms.service;

import by.tms.dao.HibernateUserDao;
import by.tms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private HibernateUserDao hibernateUserDao;

    public void createUser(User user) {
        hibernateUserDao.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return hibernateUserDao.findByUsername(username);
    }

}
