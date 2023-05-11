package by.tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OperationService {
    @Autowired
    private Calculator calculator;

    public Operation calculate(Operation operation) {


        if (operation.getType().equals("sum")) {
            operation.setResult(calculator.sum(operation.getNum1(), operation.getNum2()));
            return operation;
        }
        if (operation.getType().equals("div") && operation.getNum2() != 0) {
            operation.setResult(calculator.div(operation.getNum1(), operation.getNum2()));

            return operation;
        }
        if (operation.getType().equals("mul")) {
            operation.setResult(calculator.mul(operation.getNum1(), operation.getNum2()));

            return operation;
        }
        if (operation.getType().equals("res")) {
            operation.setResult(calculator.res(operation.getNum1(), operation.getNum2()));

            return operation;
        } else {
            throw new RuntimeException("check the correctness of the entered data!!!");
        }

    }


}
