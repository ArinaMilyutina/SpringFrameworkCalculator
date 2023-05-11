package by.tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/calc")
public class CalculatorController {
    private static final String RESULT = "result";
    private static final String MESSAGE = "message";
    @Autowired
    private OperationService operationService;

    @GetMapping
    public String calc() {
        return "calc";
    }

    @PostMapping
    public String calc(Operation operations, Model model) {
        Operation result = operationService.calculate(operations);
        model.addAttribute(RESULT, result);
        return "calc";
    }

    @ExceptionHandler(RuntimeException.class)
    public String error(RuntimeException exception, Model model) {
        model.addAttribute(MESSAGE, exception.getMessage());
        return "error";

    }

}
