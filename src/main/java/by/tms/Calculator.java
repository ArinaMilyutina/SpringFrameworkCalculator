package by.tms;

import org.springframework.stereotype.Controller;

@Controller
public class Calculator {
    double sum(double a, double b) {
        return a + b;
    }

    double res(double a, double b) {
        return a - b;
    }

    double div(double a, double b) {
        return a / b;
    }

    double mul(double a, double b) {
        return a * b;
    }

}
