package by.tms.dao;

import by.tms.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserDAO {
    @Transactional
    void save(User user);

    Optional<User> findByUsername(String username);

}
