package by.tms.dao;

import by.tms.entity.Operation;
import org.springframework.transaction.annotation.Transactional;

public interface OperationDAO {
    @Transactional
    void save(Operation operation);
}
