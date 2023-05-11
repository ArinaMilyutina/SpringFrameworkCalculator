package by.tms;

import org.springframework.transaction.annotation.Transactional;

public interface OperationDAO {
    @Transactional
    void save(Operation operation);
}
