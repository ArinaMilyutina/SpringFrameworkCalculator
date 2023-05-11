package by.tms.service;

import by.tms.dao.HibernateOperationDao;
import by.tms.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OperationService extends Calculator {

    @Autowired
    private HibernateOperationDao hibernateOperationDao;
    private static String MESSAGE_ERROR = "check the correctness of the entered data!!!";

    public Operation calculate(Operation operation) {


        if (operation.getType().equals("sum")) {
            operation.setResult(sum(operation.getNum1(), operation.getNum2()));
            createOperation(operation);
            return operation;
        }
        if (operation.getType().equals("div") && operation.getNum2() != 0) {
            operation.setResult(div(operation.getNum1(), operation.getNum2()));
            createOperation(operation);
            return operation;
        }
        if (operation.getType().equals("mul")) {
            operation.setResult(mul(operation.getNum1(), operation.getNum2()));
            createOperation(operation);
            return operation;
        }
        if (operation.getType().equals("res")) {
            operation.setResult(res(operation.getNum1(), operation.getNum2()));
            createOperation(operation);
            return operation;
        } else {
            throw new RuntimeException(MESSAGE_ERROR);
        }

    }

    public void createOperation(Operation operation) {
        hibernateOperationDao.save(operation);

    }


}
