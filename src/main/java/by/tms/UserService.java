package by.tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private HibernateUserDao hibernateUserDao;

    public void createUser(User user) {
        hibernateUserDao.save(user);
    }

}
